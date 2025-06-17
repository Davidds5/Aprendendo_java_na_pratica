package java_aps;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * GamePanel class improved with record score tracking.
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;

    // Constants for game dimensions and object sizes
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PLAYER_WIDTH = 80;
    private static final int PLAYER_HEIGHT = 80;
    private static final int ITEM_WIDTH = 80;
    private static final int ITEM_HEIGHT = 80;

    // Movement speed and item falling speed
    private static final int PLAYER_SPEED = 15;
    private static final int ITEM_FALL_SPEED_START = 6;
    private static final int ITEM_FALL_SPEED_INCREMENT = 3;
    private static final int ITEM_GENERATION_INTERVAL_START = 1500; // ms

    // Static record score shared across instances
    private static int recordScore = 0;

    private Timer gameTimer;
    private Timer countdownTimer;
    private Timer itemGeneratorTimer;

    private int playerX;
    private int playerY;

    private List<Item> items;
    private Random rand;

    private int score = 0;
    private int lives = 3;
    private int timeLeft = 60; // seconds

    private boolean moveLeft, moveRight;

    private JFrame frame;

    private int currentItemFallSpeed = ITEM_FALL_SPEED_START;
    private int currentItemGenerationInterval = ITEM_GENERATION_INTERVAL_START;

    private BufferedImage playerImage;
    private List<BufferedImage> recyclableImages = new ArrayList<>();
    private List<BufferedImage> nonRecyclableImages = new ArrayList<>();

    private BufferedImage backgroundImage;
    private BufferedImage fundoTelaInicialImage;

    public GamePanel(JFrame frame) {
        this.frame = frame;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(30, 30, 30));
        setFocusable(true);
        addKeyListener(this);

        loadImages();
        initGame();
        requestFocusInWindow();
    }

    private void loadImages() {
        try {
            playerImage = ImageIO.read(getClass().getResourceAsStream("/java_aps/imagens/lixeira.png"));
        } catch (Exception e) {
            playerImage = null;
        }

        String[] recyclablePaths = {
            "/java_aps/imagens/recyclable1.png",
            "/java_aps/imagens/recyclable2.png"
        };
        for (String path : recyclablePaths) {
            try {
                recyclableImages.add(ImageIO.read(getClass().getResourceAsStream(path)));
            } catch (Exception e) { }
        }

        String[] nonRecyclablePaths = {
            "/java_aps/imagens/non_recyclable1.png",
            "/java_aps/imagens/non_recyclable2.png"
        };
        for (String path : nonRecyclablePaths) {
            try {
                nonRecyclableImages.add(ImageIO.read(getClass().getResourceAsStream(path)));
            } catch (Exception e) { }
        }

        try {
            backgroundImage = ImageIO.read(getClass().getResourceAsStream("/java_aps/imagens/floresta.jpg"));
            if(backgroundImage == null ) {
            	System.out.println("Imagem não encontrada");
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        try {
            fundoTelaInicialImage = ImageIO.read(getClass().getResourceAsStream("/java_aps/imagens/fundo_tela_inicial.jpg"));
        } catch (Exception e) {
            fundoTelaInicialImage = null;
        }
    }

    private void initGame() {
        playerX = WIDTH / 2 - PLAYER_WIDTH / 2;
        playerY = HEIGHT - PLAYER_HEIGHT - 10;

        items = new ArrayList<>();
        rand = new Random();

        score = 0;
        lives = 3;
        timeLeft = 100;
        currentItemFallSpeed = ITEM_FALL_SPEED_START;
        currentItemGenerationInterval = ITEM_GENERATION_INTERVAL_START;

        gameTimer = new Timer(20, this);
        gameTimer.start();

        countdownTimer = new Timer(1000, e -> {
            timeLeft--;
            if (timeLeft <= 0 || lives <= 0) {
                // Atualizar recorde se necessário
                if (score > recordScore) recordScore = score;
                endGame();
            } else {
                increaseDifficulty();
            }
            repaint();
        });
        countdownTimer.start();

        itemGeneratorTimer = new Timer(currentItemGenerationInterval, e -> generateItem());
        itemGeneratorTimer.start();
    }

    private void increaseDifficulty() {
        int elapsed = 30 - timeLeft;
        if (elapsed > 0 && elapsed % 5 == 0) {
            if (currentItemFallSpeed < 20) currentItemFallSpeed += ITEM_FALL_SPEED_INCREMENT;
            if (currentItemGenerationInterval > 40) {
                currentItemGenerationInterval -= 200;
                itemGeneratorTimer.setDelay(currentItemGenerationInterval);
                itemGeneratorTimer.restart();
            }
        }
    }

    private void generateItem() {
        int x = rand.nextInt(WIDTH - ITEM_WIDTH);
        boolean recyclable = rand.nextBoolean();

        BufferedImage img = null;
        if (recyclable && !recyclableImages.isEmpty())
            img = recyclableImages.get(rand.nextInt(recyclableImages.size()));
        else if (!recyclable && !nonRecyclableImages.isEmpty())
            img = nonRecyclableImages.get(rand.nextInt(nonRecyclableImages.size()));

        items.add(new Item(x, 0, recyclable, img, ITEM_WIDTH, ITEM_HEIGHT));
    }

    private void endGame() {
        gameTimer.stop();
        countdownTimer.stop();
        itemGeneratorTimer.stop();

        TelaFinal telaFinal = new TelaFinal(score, recordScore, frame);
        frame.setContentPane(telaFinal);
        frame.revalidate();
        telaFinal.requestFocusInWindow();
    }

    // getters para usar o recorde externamente, se necessario
    public static int getRecordScore() {
        return recordScore;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (fundoTelaInicialImage != null)
            g2d.drawImage(fundoTelaInicialImage, 0, 0, WIDTH, HEIGHT, this);
        else if (backgroundImage != null)
            g2d.drawImage(backgroundImage, 0, 0, WIDTH, HEIGHT, this);
        else {
            GradientPaint gp = new GradientPaint(0, 0, new Color(20, 20, 40), 0, HEIGHT, new Color(45, 45, 70));
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, WIDTH, HEIGHT);
        }

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (playerImage != null)
            g2d.drawImage(playerImage, playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT, this);
        else {
            g2d.setColor(Color.BLUE);
            g2d.fillRoundRect(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT, 20, 20);
        }

        for (Item item : items) {
            item.draw(g2d);
        }

        g2d.setColor(new Color(0, 0, 0, 140));
        g2d.fillRoundRect(10, 10, 250, 110, 25, 25);

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Segoe UI", Font.BOLD, 20));
        g2d.drawString("Pontuação: " + score, 20, 35);
        g2d.drawString("Vidas: " + lives, 20, 65);
        g2d.drawString("Tempo: " + timeLeft, 20, 95);

        for (int i = 0; i < lives; i++) {
            int heartX = 95 + i * 30;
            drawHeart(g2d, heartX, 50, 18, Color.RED);
        }

        g2d.dispose();
    }

    private void drawHeart(Graphics2D g2d, int x, int y, int size, Color color) {
        g2d.setColor(color);
        int[] xs = {x, x + size / 2, x + size, x + size * 3 / 4, x + size / 2, x + size / 4};
        int[] ys = {y + size / 4, y, y + size / 4, y + size * 3 / 4, y + size, y + size * 3 / 4};
        g2d.fillPolygon(xs, ys, xs.length);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        movePlayer();
        moveItems();
        repaint();
    }

    private void movePlayer() {
        if (moveLeft) playerX = Math.max(0, playerX - PLAYER_SPEED);
        if (moveRight) playerX = Math.min(WIDTH - PLAYER_WIDTH, playerX + PLAYER_SPEED);
    }

    private void moveItems() {
        Rectangle playerRect = new Rectangle(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT);
        Iterator<Item> it = items.iterator();

        while (it.hasNext()) {
            Item item = it.next();
            item.y += currentItemFallSpeed;

            if (item.getBounds().intersects(playerRect)) {
                if (item.isRecyclable()) {
                    score += 10;
                } else {
                    lives--;
                }
                it.remove();
            } else if (item.y > HEIGHT) {
                it.remove();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT, KeyEvent.VK_A -> moveLeft = true;
            case KeyEvent.VK_RIGHT, KeyEvent.VK_D -> moveRight = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT, KeyEvent.VK_A -> moveLeft = false;
            case KeyEvent.VK_RIGHT, KeyEvent.VK_D -> moveRight = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    private class Item {
        private int x, y;
        private boolean recyclable;
        private BufferedImage image;
        private int width;
        private int height;

        public Item(int x, int y, boolean recyclable, BufferedImage image, int width, int height) {
            this.x = x;
            this.y = y;
            this.recyclable = recyclable;
            this.image = image;
            this.width = width;
            this.height = height;
        }

        public void draw(Graphics2D g2d) {
            if (image != null) {
                g2d.drawImage(image, x, y, width, height, GamePanel.this);
            } else {
                g2d.setColor(recyclable ? new Color(46,204,113) : new Color(231,76,60));
                g2d.fillOval(x, y, width, height);
                g2d.setColor(Color.WHITE);
                g2d.setStroke(new BasicStroke(2f));
                g2d.drawOval(x, y, width, height);
            }
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, width, height);
        }

        public boolean isRecyclable() {
            return recyclable;
        }
    }
}

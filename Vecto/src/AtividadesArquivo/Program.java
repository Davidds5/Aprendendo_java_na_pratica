package AtividadesArquivo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = sc.nextInt();

        double[] vecto = new double[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Informe a altura:");
            vecto[i] = sc.nextDouble();
        }
        double soma = 0.0;

        for (int i = 0; i <n ; i++) {
            soma += vecto[i];

        }
        // soma da altura media
        double avg = soma/ n;

        System.out.printf("Media das alturas: %.2f\n" ,avg);

        System.out.println(soma);
    }
}

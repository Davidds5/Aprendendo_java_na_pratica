package exercicio;

public class Account {
    private int number;  //  Numero da conta
    private String holder;    // titular
    private double balance;    // Conta

    public Account(int number, String holder, double depositoInicial){
        this.number = number;
        this.holder = holder;
        deposit(depositoInicial);

    }
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    // Metodos de Acesso

    // Numero da Conta Nao pode ser Apagado

    public int getNumber() {
        return number;
    }
    // Esse atributo nao tera o set



    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Metodo de saque
    public void deposit(double valor){
        balance += valor;
    }
    // Metodo de deposito
    public void whitDraw(double valor){
        balance -= valor + 5.0;
    }
    public String toString(){
        return "Account "
                + number
                + ", Holder "
                + holder
                + ", Balance: $ "
                +  String.format("%.2f", balance);
    }

}

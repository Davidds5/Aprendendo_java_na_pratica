package execicios;

public class Ex01 {
    private String titular;
    private double saldo;
    private final int numero;

    // Taxa fixa de saque
    private static final double TaxaSaque = 5.0;

    // Construtor sem depósito inicial
    public Ex01(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // Construtor com depósito inicial
    public Ex01(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    // Getters e setter apenas para titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    // Métodos de operação
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + TaxaSaque;
    }

    // Representação como string
    @Override
    public String toString() {
        return "Conta: "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}

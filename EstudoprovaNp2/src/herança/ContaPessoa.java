package herança;

public class ContaPessoa extends Pessoa {
    private boolean ctaConjunta;
    private double saldo;
    private int mesesAplicados;
    private double resgate;

    public ContaPessoa(String nome, byte idade, char estCivil, boolean ctaConjunta, double saldo, int mesesAplicados,
                       double resgate) {
        super(nome, idade, estCivil);
        this.ctaConjunta = ctaConjunta;
        this.saldo = saldo;
        this.mesesAplicados = mesesAplicados;
        this.resgate = resgate;
        setSaldo(saldo); // Pulo do gato: já calcula os outros ao definir saldo
    }

    public boolean getCtaConjunta() {
        return ctaConjunta;
    }

    public void setCtaConjunta(boolean ctaConjunta) {
        this.ctaConjunta = ctaConjunta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        calcularResgate(); // Pulo do gato aqui
    }

    public int getMesesAplicados() {
        return mesesAplicados;
    }

    public void setMesesAplicados(int mesesAplicados) {
        this.mesesAplicados = mesesAplicados;
    }

    public double getResgate() {
        return resgate;
    }

    public void setResgate(double resgate) {
        this.resgate = resgate;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        if (getCtaConjunta()) {
            System.out.println("Conta conjunta");
        } else {
            System.out.println("Conta individual");
        }
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Meses aplicados: " + mesesAplicados);
        System.out.println("Resgate: R$ " + resgate);
    }

    // Calcula meses e resgate com base no saldo
    public void calcularResgate() {
        if (this.saldo > 0) {
            this.mesesAplicados = 12;
            this.resgate = this.saldo * 1.1;
        } else {
            this.mesesAplicados = 0;
            this.resgate = 0;
        }
    }
}

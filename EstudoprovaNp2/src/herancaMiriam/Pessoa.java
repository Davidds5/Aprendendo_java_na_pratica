package herancaMiriam;

public class Pessoa {
    protected String dataNas;
    protected String nome;
    protected String cpf;
    protected String localizacao;


    // cria orvealod1
    public Pessoa(String dataNas){
        this.dataNas = dataNas;
        this.nome = nome;
        this.cpf = cpf;

    }
    // cria orvealod2
    public Pessoa(String dataNas, String nome, String cpf, String localizacao) {
        this.dataNas = dataNas;
        this.nome = nome;
        this.cpf = cpf;
        this.localizacao = localizacao;
    }

    public String getDataNas() {
        return dataNas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLocalizacao() {
        return localizacao;
    }
// metodo setters
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void apresentar(){
        System.out.println("Data nascimento: " + getDataNas());
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        if(getLocalizacao() != null){
            System.out.println("Localização: " + getLocalizacao());
        }
    }
}

package herança;

public class Pessoa {
    private String nome;
    private byte idade;
    private char estCivil;

    public Pessoa(String nome, byte idade, char estCivil){
        this.nome = nome;
        this.idade = idade;
        this.estCivil = estCivil;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public char getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(char estCivil) {
        this.estCivil = estCivil;
    }

    public void apresentar(){
        switch (estCivil){
            case 'S':
                System.out.println("Solteiro");
                break;
            case 'C':
                System.out.println("Casaddo");
                break;
            case 'D':
                System.out.println("Divorciado");
                break;
            case 'V':
                System.out.println("Viuvo");
                break;

        }
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());

    }
}

package ExerciciosFixacacao;

public class Rend {
    private String nome;
    private String gmail;

    public Rend(){

    }
    public Rend(String nome, String gmail){
        this.nome = nome;
        this.gmail = gmail;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    @Override
    public String toString() {
        return nome + ", " + gmail;
    }
}

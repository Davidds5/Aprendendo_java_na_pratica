package herancaMiriam;

public class Aluno extends Pessoa{
    private String instiuicao;

    public Aluno(String instiuicao, String dataNas, String nome, String cpf, String localizacao){
        super(dataNas, nome, cpf, localizacao);
        this.instiuicao = instiuicao;
    }
    public String getInstiuicao(){
        return  instiuicao;

    }
    public void setInstiuicao(String instiuicao){
        this.instiuicao = instiuicao;
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Instituição:" + getInstiuicao());


    }

}

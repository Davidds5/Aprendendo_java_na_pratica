package herança;

public class CursoPessoa extends Pessoa{
    private String cdConcurso;
    private char periodo;
    private int cargaHoraria;


    public CursoPessoa(String nome, byte idade, char estCivil, String cdConcurso, char periodo, int cargaHoraria) {
        super(nome, idade, estCivil);
        this.cdConcurso = cdConcurso;
        this.periodo = periodo;
        this.cargaHoraria = cargaHoraria;


    }

    public String getCdConcurso() {
        return cdConcurso;
    }

    public void setCdConcurso(String cdConcurso) {
        this.cdConcurso = cdConcurso;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Cd Curso: " + cdConcurso);
        System.out.println("Periodo: " + periodo);
        System.out.println("Carga Horaria: " + cargaHoraria);
    }
}

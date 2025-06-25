
package SistemaDeNotasDeAluno;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> Listaalunos;

    public Turma(){
        this.Listaalunos = new ArrayList<>();

    }
    public void adicionarAlunos(Aluno aluno){
        Listaalunos.add(aluno);
    }
    public void listarAlunos(){
        if (Listaalunos.isEmpty()){
            System.out.println("A lista de alunos esta Vazia.");
        }else{
            for(Aluno aluno : Listaalunos){
                System.out.println(aluno);
            }
        }

    }
    public Aluno buscaMatricula( String matricula){
        for (Aluno aluno : Listaalunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                return aluno;
            }
        }
        return null;
    }
    public void mostraResulado(){
        if (Listaalunos.isEmpty()){
            System.out.println("Nenhum aluno para mostra resultado");
        }
        else {
            for (Aluno aluno : Listaalunos){
                System.out.println(aluno);
            }
        }
    }

}

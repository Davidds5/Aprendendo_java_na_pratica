package SistemaDeNotasDeAluno;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[3];


    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public boolean aprovado(){
        return calcularMedia() >= 7.0;

    }
    public String toString(){
        return "Aluno: " + nome +
                " | Matrícula: " + matricula +
                " | Média: " + String.format("%.2f", calcularMedia()) +
                " | Situação: " + (aprovado() ? "Aprovado ✅" : "Reprovado ❌");
    }

}


package SistemaDeNotasDeAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        int opcao;
        do {
            System.out.println("\n === MENU ===");
            System.out.println("1 - CADRASTA ALUNOS");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - BUSCA ALUNOS POR MATRICULA");
            System.out.println("4 - MOSTRA RESULTADO");
            System.out.println("0 - SAIR");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Matricula do aluno: ");
                    String matricula = sc.nextLine();

                    double[] notas = new double[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Nota " + (i + 1) + " de 3");

                        // informe a nota na posicao i
                        notas[i] = sc.nextInt();

                    }
                    sc.nextLine();

                    Aluno novoAluno = new Aluno("David", "GR591", notas);
                    turma.adicionarAlunos(novoAluno);
                    System.out.println("Novo aluno adiconado com sucesso");
                    break;
            }
        }

    }
}

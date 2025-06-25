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

            System.out.println("Digite sua opcao: ");
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

                    Aluno novoAluno = new Aluno(nome, matricula, notas);
                    turma.adicionarAlunos(novoAluno);
                    System.out.println("Novo aluno adiconado com sucesso");
                    break;


                case 2:
                    System.out.println("=== LISTA DE ALUNOS ===");
                    turma.listarAlunos();
                    break;


                case 3:
                    System.out.println("Informe a matricula do aluno");
                    String Buscamatricula = sc.nextLine();
                    Aluno alunoEcontrado = turma.buscaMatricula(Buscamatricula);
                    if (alunoEcontrado != null){
                        System.out.println(alunoEcontrado);
                    }
                    else {
                        System.out.println("Aluno nao encontrado");

                    }
                    break;
                case 4:
                    turma.mostraResulado();
                    break;

                case 0:
                    System.out.println("Saindo ......");
                    break;

                default:
                    System.out.println("Opcao invalida.");



            }
        }while(opcao != 0);

        sc.close();

    }
}

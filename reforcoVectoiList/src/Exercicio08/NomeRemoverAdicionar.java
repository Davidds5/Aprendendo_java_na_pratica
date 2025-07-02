package Exercicio08;

import Exercicio02.ListadeNomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomeRemoverAdicionar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> listNomes = new ArrayList<>();
        System.out.println("Quantos nomes deseja digitar: ");
        // escolha quantos nomes vc adicionarar de primeira
        int quantidadeNumeros = sc.nextInt();

        sc.nextLine();// quebra de linha
        System.out.println("=== Digite os Nomes ===");
        // esse laco for e usado para adicionar a quantidade de nomes dependendo de quanto vc colocou acima
        for (int i = 0; i <quantidadeNumeros; i++) {
            System.out.print("Nome na Posicao " + (i + 1) + " : ");
            String nome = sc.nextLine();

            listNomes.add(nome);

        }

        System.out.println("___________________________________________________________________________________________");

        // essa parte do codigo sera usado para remover um nome
        System.out.println(" == REMOVEDOR DE NOMES ==");
        System.out.println("=== Qual nome deseja remover ===");
        String nomeRemover = sc.nextLine();

        // laco for usado caso encontra o nome na lista, se nao encontra retorna uma mensagem nao encontrado
        // usando o contains : se acha e true que e if
        // se nao acha e false que e else
        if (listNomes.contains(nomeRemover)){
            listNomes.remove(nomeRemover);
            System.out.println("Nome removido com sucesso.");
            System.out.println("Nome removido: " + nomeRemover);

        }else {
            System.out.println("Nome nao encontrado.");
        }
        System.out.println("____________________________________________________________________________________________");


        // parte do codigo usado para adiconar nomes
        System.out.println("== ADICINAR NOMES ==");
        System.out.println("=== Qual nome deseja adicionar ===");
        String nomeAdicionar = sc.nextLine();

        if(listNomes.contains(nomeAdicionar)){
            System.out.println("Nome ja esta na lista");

        }else {
            listNomes.add(nomeAdicionar);
            System.out.println("Nome adionado com sucesso");
        }


        System.out.println("___________________________________________________________________________________________-");
// laco simples usado para mostra os nomes na lista
        System.out.println("== LISTA DE NOMES ==");
        for (String nome : listNomes){
            System.out.println(nome);
        }
    }


}

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
        int quantidadeNumeros = sc.nextInt();

        System.out.println("=== Digite os Nomes ===");
        for (int i = 0; i <quantidadeNumeros; i++) {
            System.out.println("Nome na Posicao : " + (i + 1) + " :");
            String nome = sc.nextLine();

            listNomes.add(nome);

        }

        System.out.println("=== Qual nome deseja remover ===");
        String nomeRemover = sc.nextLine();

        if (listNomes.contains(nomeRemover)){
            listNomes.remove(nomeRemover);
            System.out.println("Numero removido com sucesso.");
            System.out.println("Nome removido: " + nomeRemover);

        }else {
            System.out.println("Nome nao encontrado.");
        }

        
    }

}

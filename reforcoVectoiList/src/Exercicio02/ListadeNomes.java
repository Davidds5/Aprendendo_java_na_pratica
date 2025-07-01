package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadeNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // aqui eu irei cria uma lista apenas de Strings
        // farei um for para pecorre toda a lista e adicionar nomes
        // outro for eu usarei para ixibir esses nomes
        List<String> listNomes = new ArrayList<>();

        System.out.println("Informe os nomes: ");
        for (int i = 0; i <5; i++) {
            System.out.println("Nome na posicao " + (i + 1) + " :");
            String nome = sc.nextLine();
            // aqui eu irei adicionar os nomes a listNomes
            listNomes.add(nome);

        }

        // agr eu ixibirei todos os nomes
        System.out.println("=== Mostra Nomes ===");
        for (String nome : listNomes){
            System.out.println(nome);
        }
    }
}

package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AtividadeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       List<String> list = new ArrayList<>();

        System.out.println("Lista de nomes:");
        for (int i = 0; i <5; i++) {
            String nome = sc.nextLine();

            list.add(nome);

        }
        System.out.println("Lista nomes:");
        for (String nome : list) {
            System.out.println("Nomes: " + nome);

        }
    }
}

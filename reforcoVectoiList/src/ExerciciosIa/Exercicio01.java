package ExerciciosIa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Enunciado:
//Crie um programa que peça ao usuário para digitar 5 nomes e armazene todos
//eles em uma lista. Depois mostre todos os nomes um abaixo do outro.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Quantos nomes deseja informa:");
        int n = sc.nextInt();
        sc.nextLine();


        System.out.println("Digite os nomes: ");
        for (int i = 0; i <=n ; i++) {
            System.out.println("Nome " + (i + 1) + ":");
            String nomes = sc.nextLine();
            list.add(nomes);
        }
        System.out.println("\nLista de Nomes: ");
        for (String nome : list){
            System.out.println(nome);
        }
    }
}

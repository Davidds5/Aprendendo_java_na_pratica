package Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos numeros deseja ser digitado: ");
        int quantidadeNumeros = sc.nextInt();

        List<Integer> ListNumeros = new ArrayList<>();

        System.out.println("=== Digite os numeros ===");
        for (int i = 0; i <quantidadeNumeros ; i++) {
            System.out.println("Numero na posicao " + (i+1) + " :");
            int numero = sc.nextInt();


            ListNumeros.add(numero);
        }
        int soma = 0;
        System.out.println("=== Mostre a soma ===");
        for (Integer numeros : ListNumeros){
            soma += numeros;
        }
        System.out.println(soma);
    }


}

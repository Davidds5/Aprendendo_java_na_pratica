package Exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numero deseja digitar: ");
        int numerosDigitados = sc.nextInt();

        List<Integer> ListNumeros = new ArrayList<>();

        for (int i = 0; i <numerosDigitados ; i++) {
            System.out.println("Numero na posicao " + (i + 1) + " :");
            int numero = sc.nextInt();

            ListNumeros.add(numero);
        }


        System.out.println("== Mostre apenas os numero pares ==");
        for (int i = 0; i <ListNumeros.size() ; i++) {
            if (ListNumeros.get(i) % 2 == 0){
                System.out.println(ListNumeros.get(i));
            }

        }
    }
}

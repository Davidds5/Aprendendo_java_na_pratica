package Exercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMaiorMenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja digitar: ");
        int numerosDigitados = sc.nextInt();

        List<Integer> ListNumeros = new ArrayList<>();

        System.out.println("=== Digite os numeros ===");
        for (int i = 0; i <numerosDigitados; i++) {
            System.out.println("Numero na posicao " + (i + 1 ) + " :");
            int numeros = sc.nextInt();

            ListNumeros.add(numeros);
        }

        int menor = ListNumeros.get(0);
        int maior = ListNumeros.get(0);


        System.out.println(" === Maior e Menor Numero ===");
        for (int numero : ListNumeros){
            if(numero > maior){
                maior = numero;
            }else{
                menor = numero;
            }
        }
        System.out.println(" == Maior ==");
        System.out.println(maior);
        System.out.println(" == Menor ==");
        System.out.println(menor);

    }
}

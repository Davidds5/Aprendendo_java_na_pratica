package Exercicios;
/*
 * Atividade 3 - Encontrar o maior número da lista
        Descrição:
        Crie uma lista de números inteiros. Peça ao usuário para digitar 5 números e depois mostre qual é o maior número.
        ✅ O que você deve usar:
        ArrayList<Integer>
        Scanner
        Comparação com if
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumeroList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listNumeros = new ArrayList<>();

        System.out.println("Digite os numeros: ");
        for (int i = 0; i <5; i++) {
            int numeros = sc.nextInt();

            listNumeros.add(numeros);
        }

        int maior = listNumeros.get(0);

        for (int num : listNumeros){
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("Maior numero: " + maior);


    }
}

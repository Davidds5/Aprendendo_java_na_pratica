package Exercicio05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumeroList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar: ");
        int quantidadeNumeros = sc.nextInt();

        List<Integer> ListNumeros = new ArrayList<>();

        System.out.println("=== Digite os numeros para Lista ===");
        for (int i = 0; i <quantidadeNumeros; i++) {
            System.out.println("Informe o numero na posicao " + (i + 1) + " :");
            int numero = sc.nextInt();


            ListNumeros.add(numero);
        }

        int maiorNumero = ListNumeros.get(0);
        for (int numero : ListNumeros){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println("=== O maior numero sera ===");
        System.out.println(maiorNumero );
    }
}

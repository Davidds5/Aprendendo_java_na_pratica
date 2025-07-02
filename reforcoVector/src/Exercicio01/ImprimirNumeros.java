package Exercicio01;

import java.util.Scanner;

public class ImprimirNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vecto = new int[5];

        for (int i = 0; i <5 ; i++) {
            System.out.print("Valor na posicao " + (i +1 ) + " : ");
            vecto[i] = sc.nextInt();

        }
    }
}

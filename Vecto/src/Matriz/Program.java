package Matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numeros de matrizes: ");
        int n = sc.nextInt();
        int[][] matrizIncial = new int[n][n];

        // pecorre a matriz
        // length = tamnaho
        for (int i = 0; i <matrizIncial.length ; i++) {   // linha
            for (int j = 0; j <matrizIncial[i].length ; j++) { // coluna

                // informando todas as colunas;
                System.out.println("Matriz linha " + i + " Coluna " + j );
               matrizIncial[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        // busca quantos numeros negativos tem
        int cont = 0;

        // ira pecorre linha e coluna procurando
        for (int i = 0; i <matrizIncial.length ; i++) {
            for (int j = 0; j <matrizIncial[i].length ; j++) {
                if(matrizIncial[i][j] < 0){
                    cont ++;
                }
            }
            System.out.println("Numeros Negativos: " + cont);

        }

    }

}
package Matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
          // declaracao de matriz
        int[][] mat = new int[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                mat[i][j] = sc.nextInt();

            }
            
        }

    }
}
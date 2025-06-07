package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vecto = new double[n];

        for( int i = 0; i < n; i ++){
            vecto[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i ++){
            soma += vecto[i];
        }
        double avg = soma/ n;

        System.out.printf("A Media de Tamanho e de %.2f: ", avg);

        sc.close();

    }
}

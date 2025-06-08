package Attividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }

        double media = soma / n;

        System.out.println("\nVALORES DIGITADOS:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\n", numeros[i]);
        }

        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MÉDIA = %.2f\n", media);

        scanner.close();
    }
}

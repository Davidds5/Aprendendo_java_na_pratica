package Attividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vc deseja ler: ");
        int n = sc.nextInt();
        int[] vecto = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Digite um numero: ");
            vecto[i] = sc.nextInt();

        }
        System.out.println("Numero negativos: ");
        for (int i = 0; i < n; i++) {
            if (vecto[i] < 0){
                System.out.println("Numero negativo: " + vecto[i]);
            }

        }
    }

}

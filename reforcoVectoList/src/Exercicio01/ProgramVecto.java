package Exercicio01;

import java.util.Scanner;

public class ProgramVecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("informe a quantidade de Vectores: ");
        // usuario ira escolher a quantidade de vectores
        int quantiVecto = sc.nextInt();

        // vecto declaro
        int[] vecto = new int[quantiVecto];


        // length e ultilizad para medi o tamanho do vecto
        for (int i = 0; i <= vecto.length ; i++) {
            System.out.println("Informe o vecto na posicao " + (i + 1) + " :");
            vecto[i] = sc.nextInt();


        }

        System.out.println("==== Vectores ====");
        System.out.println("Mostrando posicoes");
        for (int i = 0; i <= vecto.length; i++) {
            System.out.println("Vecto na posicao " + i + " vale " + vecto[i]);

        }

        }
    }


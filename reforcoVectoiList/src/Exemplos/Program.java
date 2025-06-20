package Exemplos;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reforco de vecto
        //declaracao de vc
//        int quantiVecto = sc.nextInt();

        // vecto declarado

        int[] Vecto = new int[3];
        System.out.println("Informe os vectores: ");
        for (int i = 0; i < Vecto.length; i++) {
            System.out.println("Vector posicao " + i + ":");
            Vecto[i] = sc.nextInt();
        }


        // Mostra na Tela as Posicoes
        System.out.println("Vectores Posicoes:");
        for (int i = 0; i < Vecto.length ; i++) {
            System.out.println("Vecto na posicao " + i + " vale " + Vecto[i]);

        }
    }
}

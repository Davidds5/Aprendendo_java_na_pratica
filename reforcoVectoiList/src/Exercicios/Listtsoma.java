package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listtsoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Informe os Numeros: ");
        for (int i = 0; i <5 ; i++) {
            System.out.print("Numero posicao " + (i + 1) + ":");
            int nList = sc.nextInt();

            list.add(nList);
        }

        int soma = 0;
        System.out.println("Exibir soma dos numeros: ");
        for (Integer N : list){
            soma += N;
        }
        System.out.println(soma);


    }
}

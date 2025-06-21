package ExerciciosIa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Informe 8 numeros :");
        for (int i = 0; i <8 ; i++) {
            System.out.println("Numero: " + (i + 1) + ":");
            int n = sc.nextInt();

            list.add(n);
        }

        int maior = list.get(0);
        int menor = list.get(0);

        for(Integer n : list){
            if(n > maior){
                maior = n;
            }else if (n < menor){
                menor = n;

            }
        }
        System.out.println(maior);
        System.out.println(menor);

    }
}
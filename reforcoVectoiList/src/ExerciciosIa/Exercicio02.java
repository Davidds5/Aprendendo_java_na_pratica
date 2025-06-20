package ExerciciosIa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Enunciado:
//Peça ao usuário para digitar 10 números inteiros. Depois mostre apenas os números pares da lista.
//
//Dica:
//Você pode usar list.get(i) para acessar os elementos.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            int n = sc.nextInt();

            list.add(n);

        }

        System.out.println("Mostre apenas os numeros pares: ");
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i));
            }

        }
        sc.close();
    }
}

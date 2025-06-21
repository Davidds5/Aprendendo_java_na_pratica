package ExerciciosIa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 5 numeros inteiros: ");
        for (int i = 0; i<5 ; i++) {
            System.out.println("Numero " + (i + 1) + ":" );
            int n = sc.nextInt();

            numeros.add(n);

        }
        int soma = 0;
        for(Integer n : numeros){
            soma += n;
        }
        System.out.println(soma);
    }
}

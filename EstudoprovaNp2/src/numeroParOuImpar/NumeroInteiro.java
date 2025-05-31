package numeroParOuImpar;

import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int x = sc.nextInt();


        if(x % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");

        }
        sc.close();

    }
}

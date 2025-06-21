package ReforcoLogicaIfElse;

import java.util.Scanner;

public class At01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar");
        }
    }
}

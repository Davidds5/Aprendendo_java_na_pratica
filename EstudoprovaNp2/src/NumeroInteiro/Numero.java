package NumeroInteiro;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int x = sc.nextInt();


        if(x % 1 == 0){
            System.out.println("Numero inteiro");
        }else{
            System.out.println("Não e numero inteiro: ");
        }

    }
}

package NIvelFacil;

import java.util.Scanner;

public class At06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a quantidade de numeros que serao somados: : ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <n ; i++) {
            soma += i;

        }
        System.out.println(soma);

    }
}

package NIvelFacil;

import java.util.Scanner;

public class At07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero que sera utilizado na sua tabuada: ");
        int numero = sc.nextInt();

        System.out.println("=========TABUADA========");
        System.out.println("Tabuada do numero " + numero  + " :");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        sc.close();
    }

}

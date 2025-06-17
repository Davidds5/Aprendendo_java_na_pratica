package AtividadesArquivo;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas Pessoas serao digitadas: ");
        int n = sc.nextInt();
        String[] vctString = new String[n];
        int[] vctInt = new int[n];
        double[] vctDouble = new double[n];


        for (int i = 0; i <n ; i++) {
            System.out.println("Dados da " + (i + 1) + " Pessoa: ");
            System.out.print("Nome: ");
            vctString[i] = sc.next();
            System.out.print("Idade: ");
            vctInt[i] = sc.nextInt();
            System.out.print("Altura: ");
            vctDouble[i] = sc.nextDouble();

        }
        double soma = 0.0;
        for (int i = 0; i <n ; i++) {
            soma += vctDouble[i];
        }
        double media = soma/n;
        System.out.println(); // usado para salta uma linha
        System.out.printf("A altura media = %.2f\n", media);

        int count = 0;
        for (int i = 0; i <n; i++) {
            if(vctInt[i] < 16){
                count += 1;
            }
        }
        double porcentagem = count * 100.0/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem );
        sc.close();
        for (int i = 0; i <n ; i++) {
            if(vctInt[i] < 16){
                System.out.println(vctString[i]);
            }

        }
    }

}

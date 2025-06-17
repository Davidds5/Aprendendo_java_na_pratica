package Aula02;

import AtividadesArquivo.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);


        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        Products[] vecto = new Products[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            // Ler name e price

            String name = sc.nextLine();

            double price = sc.nextDouble();
            vecto[i] = new Products(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i <n ; i++) {
            sum += vecto[i].getPrice();  // o getPrice e usado para acessar so o preco

        }
        double avg = sum / n;
        System.out.printf("A media dos Prices sao de: %.2f\n", avg);
        System.out.println(sum);
    }

}

package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);

        p1.setName("Tv");
        System.out.println("Updated name: " + p1.getName());

        p1.setPrice(1200);
        System.out.println("Updated price: " + p1.getPrice());

        p1.setQuantidade(3);
        System.out.println("Updated quantity: " + p1.getQuantidade());


        System.out.println("_____________________________________________________________________________");

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        p1.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + quantity);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + quantity);

        sc.close();
    }
}

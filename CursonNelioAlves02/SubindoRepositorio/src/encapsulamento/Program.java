package encapsulamento;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);

        p1.setName("Tv");
        System.out.println("Updated name: " + p1.getName());
        

    }
}

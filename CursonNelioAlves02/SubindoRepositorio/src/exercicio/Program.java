package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.println("Enter account number:");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine(); //  quebra de linha
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit(y/n):");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            // ira iniciar com o construtor de 3 argumentos
            System.out.println("Enter initial deposit value: ");
            double depositInitial = sc.nextDouble();
            account = new Account(number, holder, depositInitial);
        }
        else {
            //  iran inciar com o construtor de 2 argumentos
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Date: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depsitvalue = sc.nextDouble();
        account.deposit(depsitvalue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter withdraw value: ");
        double saqueValue = sc.nextDouble();
        account.whitDraw(saqueValue);
        System.out.println("Update account data: ");
        System.out.println(account);


    }
}

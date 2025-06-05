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
            System.out.println("Enter initial deposit value: ");
            double depositInitial = sc.nextDouble();
            account = new Account(number, holder, depositInitial);
        }
        else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Date: ");
        System.out.println(account);

    }
}

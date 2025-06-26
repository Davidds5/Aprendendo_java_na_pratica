package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento: ");
        String departamentName = sc.nextLine();

        System.out.print("Dados do Trabalhador: ");
        System.out.println("Nome :");
        String TrabalhadorName = sc.nextLine();
        System.out.println("Nivel: ");
        
    }
}

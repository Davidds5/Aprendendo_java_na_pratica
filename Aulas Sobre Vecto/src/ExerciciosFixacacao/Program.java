package ExerciciosFixacacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rend[] vecto = new Rend[10];

        System.out.println("Quantos quartos serao alugados: ");
        int numQuartos = sc.nextInt();

        for (int i = 0; i < numQuartos; i++) {
            System.out.println("Aluguel #" + (i + 1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Quarto(0/9): ");
            int roonNumero = sc.nextInt();

            while(vecto[roonNumero] != null){
                System.out.println("Quarto ja ocupado escolha outro: ");
                roonNumero = sc.nextInt();
            }
            vecto[roonNumero] = new Rend(nome,email);
        }

        System.out.println("\n Quartos ocupados: ");
        for (int i = 0; i <10; i++) {
            if(vecto[i] != null){
                System.out.println(i + ": " + vecto[i]);
            }
        }
        sc.close();
    }

}

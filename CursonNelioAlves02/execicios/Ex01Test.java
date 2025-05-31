package execicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex01Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Ex01 ex; // objeto da classe
        System.out.println("Informe o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        System.out.println("Informe o nome do titular:");
        String titular = sc.nextLine();

        System.out.println("Deseja realizar o depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);

        if (resposta == 's' || resposta == 'S') {
            System.out.println("Informe o valor do depósito inicial:");
            double depositoInicial = sc.nextDouble();
            ex = new Ex01(numero, titular, depositoInicial);
        } else {
            ex = new Ex01(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(ex);

        sc.close();
    }
}

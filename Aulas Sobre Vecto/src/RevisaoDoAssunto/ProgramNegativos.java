package RevisaoDoAssunto;
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
import java.util.Scanner;

public class ProgramNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos numeros deseja ler: ");
        int n = sc.nextInt();
        int[] vecto = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o numero na posicao: " + (i + 1));
            vecto[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < n; i++) {
            if (vecto[i] < 0) {
                System.out.println(vecto[i]);
            }

        }
    }
}

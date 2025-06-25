package ReforcoLogicaIfElse;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class At03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listNUmber = new ArrayList<>();

        System.out.println("Quantos numeros deseja digitar: ");
        int nDigitados = sc.nextInt();

        System.out.println("Digite os numeros: ");
        for (int i = 0; i <nDigitados ; i++) {
            System.out.println("Digite o numero na posicao " + (i + 1) + ":");
            int n = sc.nextInt();

            listNUmber.add(n);
        }

        int maiorNumber = listNUmber.get(0);

        for (int i = 0; i <listNUmber.size() ; i++) {
            if (maiorNumber < listNUmber.get(i)){
                maiorNumber = listNUmber.get(i);
            }

        }
        System.out.println("Maior numero: " + maiorNumber);

    }
}


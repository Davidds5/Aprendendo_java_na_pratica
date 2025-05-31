package orientacaoAObjetos;


import java.util.Locale;
import java.util.Scanner;

public class ProgramRect {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle  rec = new Rectangle();

        System.out.println("Informe a altura e largura do triamgulo: ");
        rec.altura = sc.nextDouble();
        rec.largura = sc.nextDouble();

        System.out.printf("Area : %.2%n ",  rec.area());
        System.out.printf("Perimetro : %.2%n", rec.perimnetro());
        System.out.printf("Diagonal: %.2%n" , rec.diagonal());

        sc.close();

    }
}

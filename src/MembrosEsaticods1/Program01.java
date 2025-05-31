package MembrosEsaticods1;

import java.util.Locale;
import java.util.Scanner;

import static MembrosEsaticods1.Calculadora.volume;

public class Program01 {

   // metodo staticos so podem ter metodos statics
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora();


        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = cal.cincuferencia(radius);
        double v = cal.volume(radius);

        System.out.printf("Cincurferencia: %.2f%n",  c);
        System.out.printf("Volume: %.2f%n",  v);
        System.out.printf("PI: %.2fn",  cal.PI);

        sc.close();
    }

}

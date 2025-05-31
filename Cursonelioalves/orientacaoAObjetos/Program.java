package orientacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

         double p = (x.a + x.b + x.c) / 2.0;
         double areaX = Math.sqrt(p * (p - x.a) * (p - x.b)* (p - x.c));

         p = (y.a + y.b + y.c) / 2.0;
         double areaY= Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
         System.out.printf("Triangle x area: %.4%n", areaX);
         System.out.printf("Triangle y area: %.4%n", areaY);

         if(areaX > areaY){
            System.out.println("A areaX e maior que a da areay");

         }else{
            System.out.println("A areaY e maior que a areaX");
         }



    }
}

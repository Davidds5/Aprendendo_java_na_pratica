package AitividadesIniciantes;

import java.util.Scanner;

public class Aula01EstruturaFor {
    public static void main(String []args) {
   /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o caso */

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        int x = sc.nextInt();
        /*for ( início ; condição ; incremento) {
          *  comando 1
           * comando 2
            */

       /* declara uma variavel que vai ser o cont
                declara a condição(ate aonde o i vai)
        declara o incremento i ++*/
        for(int i = 1; i <= x; i ++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

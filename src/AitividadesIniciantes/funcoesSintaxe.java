package AitividadesIniciantes;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class funcoesSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 numeros inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);
        System.out.println(maior);
        sc.close();

    }
    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if(y >z){
            aux = y;
        }else{
            aux = z;
        }
        return  aux;
    }

    // void e quando () vem vazio
    public  static void Maior(int value){
        System.out.println("Maior = " + value);

    }
}
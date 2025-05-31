package MaratonaDevdojotiposprimitivos;

import java.sql.SQLOutput;

public class Aula03Operadores {
    public static void main(String[] args) {


        // + , -, /, *

        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 + (double)numero2;


        System.out.println("Valor" + numero1 + numero2);
        System.out.println(resultado);



        // %
        int resto = 21  % 2;
        System.out.println(resto);

        int idade = 29;
        float salario = 3000;
        boolean isDentrodaLeiMaiorQUeTrinta = idade >= 30 && salario >= 4000;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3000;

        System.out.println("isdentrodaleimaiorquetrinta: " + isDentrodaLeiMaiorQUeTrinta);
        System.out.println("isdentrodaleimenorquetrinta: " + isDentrodaLeiMenorQueTrinta);


        double valorTotalcontaCorrente = 200;
        double valorTotalContaPoupanca = 3000;
        float valorPlay = 5000;
        boolean isplaycompravel = valorTotalcontaCorrente >= valorPlay || valorTotalContaPoupanca >= valorPlay;

        System.out.println("Play compravel?: " + isplaycompravel);



        // =, +=, -=, *=, /=, %=

        double bonus = 1800f;
        // aumentando o salario em 1000;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);



        int contador = 0;
//        contador += 1;
        contador ++;
        contador --;

        System.out.println("Contador: " + contador);





    }
}

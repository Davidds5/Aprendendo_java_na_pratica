package NIvelFacil;


import java.util.Scanner;

public class At04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Bem vindo a calculadora do David");
            System.out.println("_______________________________________________");
            System.out.println("ESCOLHA AS OPERACOES!!!");
            System.out.println("_______________________________________________");
            System.out.println("1 - adicao");
            System.out.println("2 - subtracao");
            System.out.println("3 - multiplicacao");
            System.out.println("4 - divisao");
            System.out.println("5 - sair");
            int opcao = sc.nextInt();

            if (opcao >=  1 && opcao  <=4 ){
                System.out.println("Informe o primeiro numero: ");
                int number1 = sc.nextInt();
                System.out.println("Informe o segundo numero: ");
                int number2 = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado : " + (number1 + number2));
                        break;
                    case 2:
                        System.out.println("Resultado : " + (number1 - number2));
                        break;
                    case 3:
                        System.out.println("Resultado : " + (number1 * number2));
                        break;
                    case 4:
                        if (number2 != 0) {
                            System.out.println("Resultado : " + (number1 / number2));
                        }else {
                            System.out.println("Divisao por zero invalida");
                            System.out.println("Tente Novamente");
                        }
                        break;

                }
            } else if (opcao == 5) {
                System.out.println("Programa encerrando........");
                break;
            }else {
                System.out.println("Opcao Invalida!!");
            }

        }
    }

}

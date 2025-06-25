package NIvelFacil;

import java.util.Scanner;

public class At02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        if(media > 7){
            System.out.println("Parabens voce foi aprovado !!!!");

        }else {
            System.out.println("Infelizmente voce ficou de exame: ");
            System.out.println("Media atual: " + media);
            System.out.println("Informe a nota do exame: ");
            double notaExame = sc.nextDouble();

            double mediaExame = (n1 + n2 + notaExame) / 3;


            if (mediaExame >= 6){
                System.out.println("Parabens voce foi aprovado !!!");
                System.out.println("Media atual : " + mediaExame);

            }else if ( mediaExame >= 4){
                System.out.println("Ficou de DP, media apos Exame: " + mediaExame);
                System.out.println("Informe a nota da DP: ");
                double Dpnota = sc.nextDouble();

                double MediaDp = (n1 + n2 + mediaExame + Dpnota) / 4;

                if (MediaDp >= 6){
                    System.out.println("Parabens voce passou, media atual :" + MediaDp);

                }else {
                    System.out.println("Infelizmente reprovado, mesmo com a DP");
                }

            }else{
                System.out.println("Infelizmente reprovado apos o exame com media : " + mediaExame);

            }
        }



    }
    }
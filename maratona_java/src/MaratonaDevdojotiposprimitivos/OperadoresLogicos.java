package MaratonaDevdojotiposprimitivos;

public class OperadoresLogicos {
    public static void main(String [] args){
        // operadores logicos
        //  &&  (AND) || (or) !
        int idade = 35;
        float salario = 3500f;
        boolean isDentrdaLeiMaiorqueTrinta = idade > 30 && salario > 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3281;

        System.out.println("IsDentroDaLeiMaiorQueTrinta: " + isDentrdaLeiMaiorqueTrinta );
        System.out.println("IsDentroDaLeiMenorQueTreinta: " + isDentrodaLeiMenorQueTrinta);

        }
}

package outrosTopicosBasicosSobreJava;

public class FuncoesStrings {
    public static void main(String[] args) {
        String original = "abcd FGHI abc DEFG";

        String s01 = original.toLowerCase(); // deixar tudo minusculo
        String s02 = original.toUpperCase();// deixar tudo maiusculo
        String s03= original.trim(); //   eliminar espaços
        String s04 = original.substring(2); // escolher de onde ixibir
        String s05 = original.substring(2, 9);// escolher de onde ixibir  aqui vai da letra na posicao 2 ate a posicao 9
        String s06 = original.replace("a", "x");// troca de caracteres(troca o a por x)
        String s07 = original.replace("abcd", "davidDOmal"); // pode trocar por qualquer nome como podem ver bc
        int x = original.indexOf("bc");
        int j = original.lastIndexOf("bc");




        System.out.println("Original: -" + original);
        System.out.println("To lowe Case: " + s01);
        System.out.println("To upper case: " + s02);
        System.out.println("trim: " + s03);
        System.out.println("Substring(2): " + s04);
        System.out.println("Substring(2, 9): " + s05);
        System.out.println("replace(a, x) " + s06);
        System.out.println("replace(abcd, davidDOmal): " + s07);
        System.out.println("index: " + x);
        System.out.println("lastindex: " + j);

    }
}

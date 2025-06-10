package AulaSobreBoxingUnboxing;

public class Program {
    public static void main(String[] args) {
        int x = 20;
        Integer obj = x;
        // se eu troca Objects por Integer e nao irei precisa usar o (int)
        int j = (int) obj;
        System.out.println(j);
    }
}
/** Wrapper Classes
 * Sao classes equivalentes aos tipos primitivos
 * boolean = Boolean
 * char = Char
 * int = Integer
 * long = Long
 * A maioria so muda a primeira letra para maisculo
 * Eles sao usados para aceitar valor null
 *
 *
 *
 */
package herança;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("David", (byte) 20, 'C');
        CursoPessoa c1 = new CursoPessoa("David", (byte) 20, 'C', "Gt947I0", 'T', 8);
        ContaPessoa Conta1 = new ContaPessoa("David", (byte) 20, 'C', true, 1800, 12, 200);

        Conta1.apresentar();
        System.out.println("_____________________________________________________________________");

        c1.apresentar();
        System.out.println("______________________________________________________________________");
        p1.apresentar();
    }
}
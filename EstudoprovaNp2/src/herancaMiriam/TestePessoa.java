package herancaMiriam;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("03/05/2004","david","000.000.000" , "Bahia" );

        p1.apresentar();

        System.out.println("____________________________________________________________________________");
        Aluno a1 = new Aluno("São Jose", "03/05/2004","david","000.000.000" , "Bahia");
        a1.apresentar();
    }
}

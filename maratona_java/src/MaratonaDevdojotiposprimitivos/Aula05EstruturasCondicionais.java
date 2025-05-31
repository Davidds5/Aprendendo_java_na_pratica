package MaratonaDevdojotiposprimitivos;

public class Aula05EstruturasCondicionais {
    public static void main(String []args){
        int idade = 20;
        boolean isAltorizadoACompraBebida = idade >= 18;

        // o if so executa se for true (verdadeiro)
        if(isAltorizadoACompraBebida) {

            System.out.println("Altorizado a comprar bebida alcolica");


            // sempre sera executado caso o if não seja
        } else {
            System.out.println("Não altorizado a comprar bebida alcolica");

        }


    }
}

package MaratonaDevdojotiposprimitivos;

public class Aula05EstruturasCondicionais2 {
    public static void main(String [] args){
        /*  idea < 15 categoria juvenil
            idade >= 15 e idade < 18  categoria infantil
            idade >= 18 categoria adulto
         */
        int idade = 20;
        String categoria;
        if(idade < 15){
            categoria = "categoria juvenil";

        } else if (idade >= 15  && idade < 18) {
            categoria = "categoria infantil";

        }else {
            categoria = "categoria adulta";
        }
        System.out.println(categoria);
    }
}

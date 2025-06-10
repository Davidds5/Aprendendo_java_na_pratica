package Lista;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Lista e uma estrutura Homogenea, ou seja dentro dela so pode ter dados do mesmo tipo
        // Ordenada(acessada por meio de posicoes)
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Luis");
        list.add("Irineu");
        list.add("Alex");
        list.add("Paulo");
        list.add("Marcos");

        System.out.println(list.size());
        System.out.println("-----------------------------------------------");
        for (String nomes : list){
            System.out.println(nomes);

        }
        System.out.println("________________________________________________");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("________________________________________________");
        System.out.println("Index Of Alex: " + list.indexOf("Alex"));
        System.out.println("Index OF Bob: " + list.indexOf("Bob"));

    }
}

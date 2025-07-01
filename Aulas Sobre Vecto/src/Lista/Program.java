package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        for (String nomes : list) {
            System.out.println(nomes);

        }
        System.out.println("________________________________________________");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); // Remover todos os itens com a primeira letra M
        for (String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("________________________________________________");
        // pocurando os nomes na list
        System.out.println("Index Of Alex: " + list.indexOf("Alex"));
        System.out.println("Index OF Bob: " + list.indexOf("Bob"));

        System.out.println("________________________________________________");
        // imprimir todos os nomes que comecam com a letra A
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String nomes : resultado) {
            System.out.println(nomes);
        }
        System.out.println("-------------------------------------------------");
        //  Primeiro elemento que comece com a letra A
        // Se nao tiver o elemento ele volta null

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}

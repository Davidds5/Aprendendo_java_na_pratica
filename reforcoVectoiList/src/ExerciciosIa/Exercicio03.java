package ExerciciosIa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        list.add("Luis");
        list.add("David");
        list.add("Luanna");
        list.add("leo");
        list.add("Gaby");
        list.add("felipe");

        System.out.println("Lista de nomes: ");
        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("\nDigite um nome para remover: ");
        String nomeRemover = sc.nextLine();

        if(list.contains(nomeRemover)){
            list.remove(nomeRemover);
            System.out.println("Nome removido com sucesso");

        }else{
            System.out.println("Nome nao encontrado");
        }

        System.out.println("\nLista atualizada");
        for(String nome : list)
            System.out.println(nome);
    }

}

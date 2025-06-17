package AtividadeFixacaoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // instacia uma list de employee
        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registered: ");
        int N = sc.nextInt();
        // parte de adiciona dados
        for (int i = 0; i <N ; i++) {
            System.out.println("Employees #" + (i + 1) +  ":");
            System.out.println("Name: ");
            // quebra de linha
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Id: ");
            Integer id = sc.nextInt();


            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(name, id, salary);
            list.add(emp);
        }
        System.out.println("Enter the employee that will id have salary increase:   ");
        int idSalary = sc.nextInt();

        // bsuca pelo id existente
        Employee emp = list.stream().filter(x-> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist");
        }else {
            System.out.println("Enter the percentage");// entra com o percentual
            double percent = sc.nextDouble();

            emp.increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employee");
        for (Employee f : list){
            System.out.println(f);
        }
        sc.close();
    }
    // pecorre a list em busca do id
    // precisa ser static

    public static int position( List<Employee> list , int id){
        // ir pelo tamanho da list=list.size()
        for (int i = 0; i < list.size() ; i++) {
            // get pega o elemento na posicao
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return - 1;
    }
}

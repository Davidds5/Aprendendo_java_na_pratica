package AtividadeFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registered: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employees# " + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            ;
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            ;
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            ;

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.println("Enter the employees id that will have salary increase: ");
        int idSalary = sc.nextInt();
        sc.close();
    }
    Integer idHas(List<Employee> list, int id) {
    
    }
}


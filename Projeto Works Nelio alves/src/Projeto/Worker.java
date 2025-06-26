package Projeto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String nome;
    private WorkerLevel workerLevel;
    private Double baseSalary;

    private Department department;
    private List<HoursContract> contracts = new ArrayList<>();

    public Worker(){

    }
    public Worker(String nome, WorkerLevel workerLevel, Double baseSalary, Department department){
        this.nome = nome;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }
    public void addContract(HoursContract contract){
        contracts.add(contract);

    }
    public void removerContract(HoursContract contract){
        contracts.remove(contract);
    }
    public Double incom(int year, int month ) {
        double soma = baseSalary;
        Calendar cl = Calendar.getInstance();
        for (HoursContract c : contracts) {
            cl.setTime(c.getDate());
            int c_year = cl.get(Calendar.YEAR);
            int c_month = 1 + cl.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }

        }
        return  soma;
    }
}

package Projeto;

import java.util.Date;

public class HoursContract {
    private Date date;
    private Double valuePerHours;
    private Integer hours;

    public HoursContract(Date date, Double valueRerHours, Integer hours){
        this.date = date;
        this. valuePerHours = valueRerHours;
        this.hours = hours;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValueRerHours(Double valueRerHours) {
        this.valuePerHours = valueRerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double totalValue(){
        return  valuePerHours * hours;

    }
}

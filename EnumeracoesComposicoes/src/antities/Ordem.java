package antities;

import entities.enums.OrdeStatus;

import java.util.Date;

public class Ordem {
    private int id;
    private Date moment;
    private OrdeStatus status;

    public Ordem(int id, Date moment, OrdeStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdeStatus getStatus() {
        return status;
    }

    public void setStatus(OrdeStatus status) {
        this.status = status;
    }
    public String toString(){
        return "Ordem id: " + id + " Moment: " + moment + " Status: " + status  ;
    }
}

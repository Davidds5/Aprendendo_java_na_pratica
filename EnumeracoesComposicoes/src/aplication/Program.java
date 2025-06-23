package aplication;

import antities.Ordem;
import entities.enums.OrdeStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Ordem ordem = new Ordem(3459, new Date(), OrdeStatus.PENDING_PAYMENT);

        System.out.println(ordem);

        OrdeStatus os1 = OrdeStatus.DELIVERED;
        OrdeStatus os2 = OrdeStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}

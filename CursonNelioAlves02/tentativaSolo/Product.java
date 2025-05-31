package tentativaSolo;

public class Product {
    public String name;
    public double pricce;
    public int quantity;



    //criacao de metodo construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.pricce = price;
        this.quantity = quantity;

    }


    //sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.pricce = price;
     
    }
}

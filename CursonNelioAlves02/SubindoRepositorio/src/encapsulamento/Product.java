package encapsulamento;

public class Product {
    private String name;
    private double price;
    private int quantidade;

//   sobrecarga de construtores
    public Product(){}


    public Product(String name, double price, int quantidade){
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;

    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantidade(){
        return quantidade;

    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

    }



  //  Metodos de remover e add products
    public void removeProducts(int quantidade){
        if(quantidade > 0){
            quantidade -= quantidade;
        }

    }
    public void addProducts(int quantidade){
        quantidade += quantidade;
    }
    public String toString(){
        return "Name: " +
        name +
        " Price: " +
        price +
        "Quantity: "+
        quantidade;

    }
}

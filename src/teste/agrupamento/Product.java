package teste.agrupamento;

public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(double quantity){
        this.quantity -= quantity;
    }
}

package Part4.OOP;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product (double initialPrice, int initialQuantity, String initialName) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs ");
    }
}

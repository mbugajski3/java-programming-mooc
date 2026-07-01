package Part8.Recap.HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ProductPrices prices = new ProductPrices();

        prices.addProduct("milk", 4.99);
        prices.addProduct("bread", 3.50);
        prices.addProduct("cheese", 12.99);
        prices.addProduct("milk", 5.49);

        System.out.println(prices.getPrice("milk"));
        System.out.println(prices.getPrice("bread"));
        System.out.println(prices.getPrice("unknown"));

        System.out.println(prices.hasProduct("cheese"));
        System.out.println(prices.hasProduct("butter"));

        System.out.println(prices.isExpensive("cheese"));
        System.out.println(prices.isExpensive("milk"));
        System.out.println(prices.isExpensive("butter"));
    }
}

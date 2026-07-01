package Part8.Recap.HashMap;

import java.util.HashMap;

public class ProductPrices {
    private final HashMap<String, Double> prices;

    public ProductPrices() {
        this.prices = new HashMap<>();
    }

    public void addProduct(String product, double price) {
        this.prices.put(product, price);
    }

    public double getPrice(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -1;
        }
    }

    public boolean hasProduct(String product) {
        return this.prices.containsKey(product);
    }

    public boolean isExpensive(String product) {
        double price = 10.0;

        if (this.prices.containsKey(product)) {
            return (this.prices.get(product) > price);
        } else {
            return false;
        }
    }
}

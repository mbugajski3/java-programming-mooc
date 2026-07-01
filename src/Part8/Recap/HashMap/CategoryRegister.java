package Part8.Recap.HashMap;

import java.util.HashMap;
import java.util.ArrayList;

public class CategoryRegister {

    private final HashMap<String, ArrayList<String>> categories;

    public CategoryRegister() {
        this.categories = new HashMap<>();
    }

    public void addProduct(String category, String product) {
        if (!this.categories.containsKey(category)) {
            this.categories.put(category, new ArrayList<>());
        }

        this.categories.get(category).add(product);
    }

    public ArrayList<String> getProducts(String category) {
        if (!this.categories.containsKey(category)) {
            return new ArrayList<>();
        } else {
            return this.categories.get(category);
        }
    }

    public boolean hasCategory(String category) {
        return this.categories.containsKey(category);
    }

    public int amountOfProducts(String category) {
        if (!this.categories.containsKey(category)) {
            return 0;
        } else {
            return this.categories.get(category).size();
        }
    }
}

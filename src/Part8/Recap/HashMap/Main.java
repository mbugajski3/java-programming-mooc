package Part8.Recap.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CategoryRegister register = new CategoryRegister();

        register.addProduct("fruit", "apple");
        register.addProduct("fruit", "banana");
        register.addProduct("drink", "water");
        register.addProduct("drink", "coffee");
        register.addProduct("meat", "chicken");

        System.out.println(register.getProducts("fruit"));
        System.out.println(register.getProducts("drink"));
        System.out.println(register.getProducts("unknown"));

        System.out.println(register.hasCategory("meat"));
        System.out.println(register.hasCategory("vegetables"));

        System.out.println(register.amountOfProducts("fruit"));
        System.out.println(register.amountOfProducts("unknown"));
    }
}


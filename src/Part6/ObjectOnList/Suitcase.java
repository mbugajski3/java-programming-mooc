package Part6.ObjectOnList;
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;

        for (Item item : items) {
            sum = sum + item.getWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + " kg" + ")";
        }
        if (this.items.size() == 0) {
            return "no items " + "(" + this.totalWeight() + " kg" + ")";
        }
        return this.items.size() + " items " + "(" + this.totalWeight() + " kg" + ")";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}

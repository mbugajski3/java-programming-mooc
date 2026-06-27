package Part6.ObjectOnList;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(suitcase.totalWeight() > this.maxWeight)) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        if (this.suitcases.size() == 0) {
            return 0;
        }

        int sum = 0;

        for (Suitcase suitcase : suitcases) {
            sum = sum + suitcase.totalWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        if (this.suitcases.size() == 0) {
            return "0 suitcases " + "(" + this.totalWeight() + " kg" + ")";
        }
        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcasea " + "(" + this.totalWeight() + " kg" + ")";
        }
        return this.suitcases.size() + " suitcases " + "(" + this.totalWeight() + " kg" + ")";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}

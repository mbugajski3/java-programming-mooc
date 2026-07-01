package Part8.Recap.HashMap;

import java.util.HashMap;

public class IOU {
    private final HashMap<String, Double> personDebt;

    public IOU() {
        this.personDebt = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.personDebt.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.personDebt.getOrDefault(toWhom, 0.0);
    }

}

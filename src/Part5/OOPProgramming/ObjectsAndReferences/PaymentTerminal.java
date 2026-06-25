package Part5.OOPProgramming.ObjectsAndReferences;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {

        double affordableMeal = 2.50;

        if (payment >= affordableMeal) {
            this.affordableMeals++;
            this.money = this.money + affordableMeal;
            double change = payment - affordableMeal;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {

        double heartyMeal = 4.30;

        if (payment >= heartyMeal) {
            this.heartyMeals++;
            this.money = this.money + heartyMeal;
            double change = payment - heartyMeal;
            return change;
        } else {
            return payment;
        }
    }

    public String toString() {
        return "money: " + this.money + ", number of sold afforable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}



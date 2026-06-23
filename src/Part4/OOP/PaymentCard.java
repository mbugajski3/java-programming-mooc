package Part4.OOP;

public class PaymentCard {
    private double balance;

    public PaymentCard(double cardBalance) {
        this.balance = cardBalance;
    }
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}

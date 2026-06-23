package Part4.OOP;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    public void printBalance() {
        System.out.println("Initial balance: " + this.balance);
    }
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}

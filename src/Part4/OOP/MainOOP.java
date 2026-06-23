package Part4.OOP;

public class MainOOP {
    public static void main (String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}

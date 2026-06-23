public class MainOOP {
    public static void main (String[] args) {
        Account michalAccount = new Account("Michal's account", 100.0);

        michalAccount.deposit(20.0);

        System.out.println("The balance of Michal's account is now: " + michalAccount.balance());

    }
}

import java.util.Scanner;

public class Login {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validUserName1 = "alex";
        String validUserPassword1 = "sunshine";
        String validUserName2 = "emma";
        String validUserPassword2 = "haskell";


        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine().trim();
        System.out.println("Enter password: ");
        String inputUserPassword = scanner.nextLine().trim();

        boolean isUser1 = inputUsername.equals(validUserName1) && inputUserPassword.equals(validUserPassword1);
        boolean isUser2 = inputUsername.equals(validUserName2) && inputUserPassword.equals(validUserPassword2);

        if (isUser1 || isUser2) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

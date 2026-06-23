import java.util.Scanner;

public class FirstWords {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write text phrase: ");
        String inputPhrase = scanner.nextLine();

        while (true) {
            if (inputPhrase.isEmpty()) {
                break;
            }
            String[] pieces = inputPhrase.split(" ");
            System.out.println(pieces[0]);
            break;
        }
    }
}

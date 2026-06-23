import java.util.Scanner;

public class LastWords {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write text phrase: ");
        String inputPhrase = scanner.nextLine();

        while (true) {
            if (inputPhrase.isEmpty()) {
                break;
            }
            String[] pieces = inputPhrase.split(" ");
            System.out.println("Number of parts: " + pieces.length);
            System.out.println(pieces[pieces.length - 1]);
            break;
        }
    }
}

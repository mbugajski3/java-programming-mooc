import java.util.Scanner;

public class LineByLine {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write phrase to split: ");
        String inputPhrase = scanner.nextLine();

        if (!inputPhrase.isEmpty()) {
            String [] pieces = inputPhrase.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        } else {
            System.out.println("Text is empty.");
        }
    }
}

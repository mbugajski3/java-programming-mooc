import java.util.Scanner;

public class AVClub {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text input phrase: ");
        String inputPhrase = scanner.nextLine().toLowerCase();

        String lookingFor = "AV";

        if (!inputPhrase.isEmpty()) {
            String [] pieces = inputPhrase.split(" ");
            for (String piece : pieces) {
                if (piece.contains(lookingFor.toLowerCase())) {
                    System.out.println(piece);
                }
            }
        }
    }
}

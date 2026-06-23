import java.util.Scanner;

public class PrintThrice {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String inputWord = scanner.nextLine();

        String phrase = inputWord + inputWord + inputWord;

        System.out.println(phrase);
    }
}

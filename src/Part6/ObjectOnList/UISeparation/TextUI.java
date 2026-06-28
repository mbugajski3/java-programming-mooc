package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Enter a command: ");
            String inputCommand = this.scanner.nextLine().trim().toLowerCase();

            if (inputCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (inputCommand.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = this.scanner.nextLine();

                if (!toBeTranslated.isEmpty()) {
                    String translatedWord = dictionary.translate(toBeTranslated);

                    if (translatedWord == null) {
                        System.out.println("Word " + toBeTranslated + " was not found");
                    } else {
                        System.out.println("Translation: " + translatedWord);
                    }

                } else {
                    System.out.println("No word entered. Try again.");
                }

            } else if (inputCommand.equals("add")) {
                System.out.println("Enter word to translate: ");
                String wordToTranslate = this.scanner.nextLine();

                if (!wordToTranslate.isEmpty()) {
                    System.out.println("Translation: ");
                    String translatedWord = this.scanner.nextLine();
                    dictionary.add(wordToTranslate, translatedWord);

                } else {
                    System.out.println("No word entered. Try again");
                }

            } else {
                System.out.println("Unknown command. Try again.");
            }
        }
    }
}
package Part4.OOP.FilesAndReadingData;
import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {
    public static void main (String[] args) {
        Scanner inputKeyboardReader = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String inputFile = inputKeyboardReader.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(inputFile))) {
            while (fileReader.hasNextLine()) {
                String fileRow = fileReader.nextLine();
                System.out.println(fileRow);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


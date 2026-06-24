package Part4.OOP.FilesAndReadingData;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecordsFromAFile {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String inputFileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(inputFileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] lineToPieces = line.split(",");
                String name = lineToPieces[0];
                int age = Integer.valueOf(lineToPieces[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.print("Error: " + inputFileName + " is invalid.");
        }
    }
}

package Part4.FilesAndReadingData;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IsItInTheFile {
    public static void main (String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String inputFileName = scanner.nextLine();

        System.out.println("Search for: ");
        String searchedName = scanner.nextLine().trim().toLowerCase();

        try (Scanner inputFileReader = new Scanner(Paths.get(inputFileName))) {
            while (inputFileReader.hasNextLine()) {
                String row = inputFileReader.nextLine().trim().toLowerCase();
                listNames.add(row);
            }
            if (searchedName.isEmpty()) {
                System.out.println("No input found");
            }
            if (!(listNames.contains(searchedName))) {
                System.out.println("Not found.");
            } else {
                System.out.println("Found!");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + inputFileName + " failed.");
        }
    }
}

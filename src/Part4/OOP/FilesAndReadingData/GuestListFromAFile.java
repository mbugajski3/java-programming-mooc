package Part4.OOP.FilesAndReadingData;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GuestListFromAFile {
    public static void main (String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String inputFileName = scanner.nextLine();

        try (Scanner inputFileReader = new Scanner(Paths.get(inputFileName))) {
            while (inputFileReader.hasNextLine()) {
                String row = inputFileReader.nextLine().trim().toLowerCase();
                guests.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter names, an empty line quits.");

        while (true) {
            String guestName = scanner.nextLine().trim().toLowerCase();

            if (guestName.isEmpty()) {
                break;
            }

            if (guests.contains(guestName)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}

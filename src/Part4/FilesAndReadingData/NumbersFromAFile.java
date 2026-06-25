package Part4.FilesAndReadingData;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class NumbersFromAFile {
    public static void main (String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        ArrayList<Integer> numbersFound = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String fileName = scanner.nextLine();

        System.out.print("Lower bound? ");
        String inputLowerBound = scanner.nextLine();

        System.out.print("Upper bounds? ");
        String inputUpperBound = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                int row = Integer.valueOf(fileReader.nextLine());
                numbersList.add(row);
            }
        } catch (Exception e) {
            System.out.print("Error: " + fileName + " is wrong.");
        }

        if (inputLowerBound.isEmpty()) {
            System.out.print("Input lower bound is empty.");
        }
        if (inputUpperBound.isEmpty()) {
            System.out.print("Input upper bound is empty.");
        }
        int lowerBound = Integer.valueOf(inputLowerBound);
        int upperBound = Integer.valueOf(inputUpperBound);

        for (int number : numbersList) {
            if (number >= lowerBound && number <= upperBound) {
                numbersFound.add(number);
            }
        }
        System.out.print("Numbers: " + numbersFound.size());
    }
}

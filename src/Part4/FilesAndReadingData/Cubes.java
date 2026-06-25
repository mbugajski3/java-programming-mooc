package Part4.FilesAndReadingData;
import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputNumber = scanner.nextLine().trim().toLowerCase();

            if (inputNumber.equals("end")) {
                break;
            }
            int number = Integer.valueOf(inputNumber);
            int result = number * number * number;
            System.out.println(result);
        }
    }
}

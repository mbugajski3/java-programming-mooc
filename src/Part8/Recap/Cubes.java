package Part8.Recap;
import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String inputNumber = scanner.nextLine().trim().toLowerCase();

            if (inputNumber.equals("end")) {
                break;
            }
            int inputNumberValue = Integer.valueOf(inputNumber);

            inputNumberValue = inputNumberValue * inputNumberValue * inputNumberValue;
            System.out.println(inputNumberValue);
        }
    }
}

package Part4.OOP;
import java.util.Scanner;

public class MainOOP {
    public static void main (String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter numbers: ");
            int inputNumbers = Integer.valueOf(scanner.nextLine());

            if (inputNumbers == -1) {
                break;
            } else {
                statistics.addNumber(inputNumbers);
            }
        }
        System.out.println("Sum: " + statistics.sum());
    }
}

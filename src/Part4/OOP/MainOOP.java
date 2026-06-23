package Part4.OOP;
import java.util.Scanner;

public class MainOOP {
    public static void main (String[] args) {
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter numbers: ");
            int inputNumbers = Integer.valueOf(scanner.nextLine());

            if (inputNumbers == -1) {
                break;
            } else {
                statisticsAll.addNumber(inputNumbers);
                if ((inputNumbers % 2) == 0) {
                    statisticsEven.addNumber(inputNumbers);
                } else {
                    statisticsOdd.addNumber(inputNumbers);
                }
            }
        }
        System.out.println("Sum: " + statisticsAll.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}

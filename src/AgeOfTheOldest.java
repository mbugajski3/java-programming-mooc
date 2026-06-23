import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestAge = -1;
        String nameOfOldest = "";

        while (true) {
            System.out.println("Enter name: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            } else {
            System.out.println("Enter age: ");
            String inputAge = scanner.nextLine();
            String inputResult = inputName + "," + inputAge;
            String[] nameList = inputResult.split(",");
            String name = String.valueOf(nameList[0]);
            int age = Integer.valueOf(nameList[1]);

            if (age > highestAge) {
                nameOfOldest = name;
                highestAge = age;
            }

            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}

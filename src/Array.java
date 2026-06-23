import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String [] args) {
        ArrayList<String> listNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type input name: ");
            String nameInput = scanner.nextLine();

            if (nameInput.isEmpty()) {
                if (listNames.isEmpty()) {
                    System.out.println("List is empty.");
                    break;
                } else {
                    System.out.println(listNames);
                    break;
                }
            }
            listNames.add(nameInput);
        }

        System.out.println("Search for?");
        String inputName = scanner.nextLine();

        if (listNames.contains(inputName)) {
            System.out.println(inputName + " was found");
        } else {
            System.out.println(inputName + " was not found");
        }
    }
}
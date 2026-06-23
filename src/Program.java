import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int lastAddedIndex = -1;

        while (true) {
            System.out.println("Type name to add to list: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Total index count of 'teachers' list: " + lastAddedIndex);
                System.out.println("List of teachers:");
                for (String teacher : teachers) {
                    System.out.println("- " + teacher);
                }
                break;
            } else {
                teachers.add(name);
                lastAddedIndex = teachers.size() - 1;
            }
        }

        if (teachers.size() == 0) {
            System.out.println("List is empty");

        } else {
            while (true) {
                System.out.println("Select index to show result: ");
                String input = String.valueOf(scanner.nextLine());

                if (input.isEmpty()) {
                    break;
                }

                int index = Integer.valueOf(input);

                if (index >= 0 && index < teachers.size()) {
                    System.out.println(teachers.get(index));
                } else {
                    System.out.println("Wrong index");
                }
            }
        }
    }
}
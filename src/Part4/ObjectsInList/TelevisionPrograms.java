package Part4.ObjectsInList;
import java.util.Scanner;
import java.util.ArrayList;

public class TelevisionPrograms {
    public static void main (String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(inputName, duration));

        }
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram completedProgram : programs) {
            if (completedProgram.getDuration() <= maxDuration) {
                System.out.println(completedProgram);
            }
        }
    }
}

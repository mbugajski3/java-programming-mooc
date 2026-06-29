package Part7.ProgrammingParadigms.LargerProgramming;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Birds birds;

    public UserInterface(Scanner scanner, Birds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {

        while (true) {
            System.out.println("?");
            String inputCommand = this.scanner.nextLine().trim().toLowerCase();


            if (inputCommand.equals("quit")) {
                break;

            }else if (inputCommand.equals("add")) {
                System.out.println("Name: ");
                String inputName = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String inputLatinName = scanner.nextLine();

                Bird bird = new Bird(inputName, inputLatinName);
                birds.addBird(bird);

            } else if (inputCommand.equals("observation")) {
                System.out.println("Bird?");
                String inputBird = scanner.nextLine().trim();
                boolean found = false;

                for (Bird bird : birds.getBirds()) {
                    if (bird.getName().equals(inputBird)) {
                        bird.addObservation();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }

            } else if (inputCommand.equals("all")) {
                for (Bird bird : birds.getBirds()) {
                    System.out.println(bird);
                }
            } else if (inputCommand.equals("one")) {
                System.out.println("Bird?");
                String inputBird = scanner.nextLine();
                boolean found = false;

                for (Bird bird : birds.getBirds()) {
                    if (bird.getName().equals(inputBird)) {
                        System.out.println(bird);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Bird not found");
                }
            }
        }
    }
}

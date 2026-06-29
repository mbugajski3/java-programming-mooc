import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    private Scanner scanner;
    private Container container1;
    private Container container2;

    public LiquidContainers(Scanner scanner, Container container1, Container container2) {
        this.scanner = scanner;
        this.container1 = container1;
        this.container2 = container2;

    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.container1);
            System.out.println("Second: " + this.container2);
            System.out.println();
            String inputCommand = this.scanner.nextLine().trim().toLowerCase();

            if (inputCommand.equals("quit")) {
                break;
            }
            if (!(inputCommand.isEmpty())) {
                String[] commandSplit = inputCommand.split(" ");
                String command = commandSplit[0];
                int value = Integer.valueOf(commandSplit[1]);

                if (command.equals("add")) {
                    container1.add(value);

                } else if (command.equals("remove")) {
                    container2.remove(value);

                } else if (command.equals("move")) {
                    move(value);
                }
            }
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            int amountToMove;

            if (amount > container1.contains()) {
                amountToMove = container1.contains();
            } else {
                amountToMove = amount;
            }

            container1.remove(amountToMove);
            container2.add(amountToMove);
        }
    }
}

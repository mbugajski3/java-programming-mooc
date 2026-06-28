package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ToDoList list;

    public UserInterface(Scanner scanner, ToDoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println("Enter command: ");
            String inputCommand = this.scanner.nextLine().trim().toLowerCase();

            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("add")) {
                System.out.println("Enter a task: ");
                String inputTask = this.scanner.nextLine().trim().toLowerCase();

                if (!(inputTask.isEmpty())) {
                    this.list.add(inputTask);
                } else {
                    System.out.println("Input is empty, try again");
                }
            } else if (inputCommand.equals("list")) {
                this.list.print();
            } else if (inputCommand.equals("remove")) {
                while(true) {
                    System.out.println("Enter ID of item to remove: ");
                    String inputRemove = this.scanner.nextLine().trim();

                    if (inputRemove.isEmpty()) {
                        System.out.println("Input is empty, try again");
                        continue;
                    }

                    try {
                        int number = Integer.valueOf(inputRemove);
                        this.list.remove(number);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Input must be a number. Try again");
                    }
                }

            } else {
                System.out.println("Command is invalid. Try again.");
            }
        }
    }
}

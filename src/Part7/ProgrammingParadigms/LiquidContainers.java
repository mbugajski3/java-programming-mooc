package Part7.ProgrammingParadigms;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int amountToMove = 0;

        Scanner scanner = new Scanner("add 1000\n" + "move 50\n" + "add 100\n" + "move 100\n"  + "quit");

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.println();
            String inputCommand = scanner.nextLine().trim().toLowerCase();

            if (!(inputCommand.isEmpty())) {

                if (inputCommand.equals("quit")) {
                    break;
                }
                String[] commandToParts = inputCommand.split(" ");
                String command = commandToParts[0];
                int amount = Integer.valueOf(commandToParts[1]);

                if (command.equals("add")) {
                    if ((first + amount) > 100 && amount > 0) {
                        first = 100;
                    } else {
                        first = first + amount;
                    }

                } else if (command.equals("move")) {
                    if (amount > 0) {
                        if (amount > first) {
                            amountToMove = first;
                        } else {
                            amountToMove = amount;
                        }

                        first = first - amountToMove;

                        if (second + amountToMove > 100) {
                            second = 100;
                        } else {
                            second = second + amountToMove;
                        }
                    }

                } else if (command.equals("remove")) {
                    if (amount > 0) {
                        if ((second - amount) < 0) {
                            second = 0;
                        } else {
                            second = second - amount;
                        }
                    } else {
                        System.out.println("Number cannot be negative.");
                    }

                } else {
                    System.out.println("Unknown command.");
                }
            } else {
                break;
            }
        }
    }
}

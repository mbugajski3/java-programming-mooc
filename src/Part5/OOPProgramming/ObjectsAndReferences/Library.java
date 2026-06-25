package Part5.OOPProgramming.ObjectsAndReferences;

import java.util.Scanner;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> booksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            } else {
                System.out.println("Publication year: ");
                String inputYear = scanner.nextLine();

                if (inputYear.isEmpty()) {
                    break;
                } else {
                    int inputYearNumber = Integer.valueOf(inputYear);

                    Book book = new Book(inputName, inputYearNumber);

                    if (booksList.contains(book)) {
                        System.out.println("The book is already on list. Let's not add the same book again.");
                    } else {
                        booksList.add(book);
                    }
                }
            }
        }
        System.out.println("Thank you! Books added: " + booksList.size());
    }
}

package Part4.ObjectsInList;
import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    public static void main(String[] args) {
        ArrayList<Book> booksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String inputTitle = scanner.nextLine();

            if (inputTitle.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int inputPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int inputPublicationYear = Integer.valueOf(scanner.nextLine());
            booksList.add(new Book(inputTitle, inputPages, inputPublicationYear));
        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String inputInformation = scanner.nextLine().toLowerCase().trim();

        for (Book book : booksList) {
            if (inputInformation.equals("everything")) {
                System.out.println(book);
            } else if (inputInformation.equals("name")) {
                System.out.println(book.getTitle());
            } else if (inputInformation.equals("pages")) {
                System.out.println(book.getPages());
            } else if (inputInformation.equals("publication year")){
                System.out.println(book.getPublicationYear());
            }
        }
    }
}

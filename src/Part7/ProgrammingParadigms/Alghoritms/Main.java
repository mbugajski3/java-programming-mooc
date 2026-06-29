package Part7.ProgrammingParadigms.Alghoritms;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book(1, "Clean Code");
        Book book2 = new Book(3, "Effective Java");
        Book book3 = new Book(7, "Java Basics");
        Book book4 = new Book(12, "Algorithms");
        Book book5 = new Book(20, "Spring Boot Guide");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println(linearSearch(books, 1));   // expected: 0
        System.out.println(linearSearch(books, 7));   // expected: 2
        System.out.println(linearSearch(books, 20));  // expected: 4
        System.out.println(linearSearch(books, 999)); // expected: -1
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;

        while(begin > end) {
            int middle = (end + begin / 2);
            int middleId = books.get(middle).getId();

            if (middleId == searchedId) {
                return middle;
            }

            if (middleId < searchedId) {
                begin = middle + 1;
            }

            if (middleId > searchedId) {
                end = middle - 1;
            }
        }

        return -1;
    }
}

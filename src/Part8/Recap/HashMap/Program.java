package Part8.Recap.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {


    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();

        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);

        System.out.println("---");

        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String string : hashmap.keySet()) {
            System.out.println(string);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String string : hashmap.keySet()) {
            if (string.contains(text)) {
                System.out.println(string);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String string : hashmap.keySet()) {
            if (string.contains(text)) {
                System.out.println(hashmap.get(string));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book book : hashMap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }
}
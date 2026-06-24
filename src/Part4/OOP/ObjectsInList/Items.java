package Part4.OOP.ObjectsInList;

import java.util.Scanner;
import java.util.ArrayList;

public class Items {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();


        while (true) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            } else {
                items.add(new Item(inputName));
            }
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
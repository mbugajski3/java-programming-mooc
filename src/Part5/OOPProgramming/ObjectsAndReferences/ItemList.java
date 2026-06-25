package Part5.OOPProgramming.ObjectsAndReferences;
import java.util.Scanner;
import java.util.ArrayList;

public class ItemList {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Identifier?");
            String inputIdentifier = scanner.nextLine();

            if (inputIdentifier.isEmpty()) {
                break;
            }
            System.out.println("Name?");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            }
            Item item = new Item(inputIdentifier, inputName);

            if (!(itemList.contains(item))) {
                itemList.add(item);
            }
        }
        System.out.println("==Items==");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}

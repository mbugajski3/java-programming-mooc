package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }
}
package Part7.ProgrammingParadigms.Alghoritms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1};
        Main.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        // [1, 3, 7, 8, 9]

        String[] words = {"banana", "apple", "pear"};
        Main.sort(words);
        System.out.println(Arrays.toString(words));
        // [apple, banana, pear]

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(3);
        integers.add(7);

        Main.sortIntegers(integers);
        System.out.println(integers);
        // [3, 7, 8]

        ArrayList<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("pear");

        Main.sortStrings(strings);
        System.out.println(strings);
        // [apple, banana, pear]

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}

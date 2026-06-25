package Part4.FilesAndReadingData;
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while(true) {
            String inputString = scanner.nextLine().trim().toLowerCase();
            if (inputString.equals("end")) {
                break;
            } else {
                strings.add(inputString);
            }
        }
        System.out.println(strings.size());
    }
}

package Part7.ProgrammingParadigms.LargerProgramming;
import java.util.Scanner;

public class MainBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Birds birds = new Birds();
        UserInterface ui = new UserInterface(scanner, birds);
        ui.start();
    }
}

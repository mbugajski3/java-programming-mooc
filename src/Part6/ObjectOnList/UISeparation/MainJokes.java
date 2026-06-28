package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;

public class MainJokes {
    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterfaceJokes ui = new UserInterfaceJokes(scanner, manager);
        ui.start();
    }
}

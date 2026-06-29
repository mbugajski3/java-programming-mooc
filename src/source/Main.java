import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scanner = new Scanner(
        "add 80\n" +
                "move 30\n" +
                "add 70\n" +
                "move 90\n" +
                "remove 40\n" +
                "add 25\n" +
                "move 50\n" +
                "remove 200\n" +
                "add 1000\n" +
                "move 20\n" +
                "quit\n");
        LiquidContainers ui = new LiquidContainers(scanner, container1, container2);
        ui.start();
    }
}

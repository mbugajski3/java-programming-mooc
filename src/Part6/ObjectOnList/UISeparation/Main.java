package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterfaceGrades ui = new UserInterfaceGrades(register, scanner);
        ui.start();
    }
}
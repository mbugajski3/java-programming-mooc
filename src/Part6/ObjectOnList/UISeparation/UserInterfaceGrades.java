package Part6.ObjectOnList.UISeparation;
import java.util.Scanner;

public class UserInterfaceGrades {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterfaceGrades(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.println("Points: ");
            String inputPoint = this.scanner.nextLine();

            if (inputPoint.isEmpty()) {
                break;
            }

            try {
                int points = Integer.valueOf(inputPoint);

                if (points < 0 || points > 100) {
                    System.out.println("Impossible number.");
                    continue;
                }

                this.register.addGradeBasedOnPoints(points);

            } catch (NumberFormatException e) {
                System.out.println("Points must be a number. Try again.");
            }
        }
    }

    public void printGradeDistribution() {
        for (int grade = 5; grade >= 0; grade--) {
            System.out.println(grade + ": " + gradesToStars(this.register.numberOfGrades(grade)));
        }

        System.out.println("The average of points: " + ((this.register.averageOfPoints() * 100.00) / 100));
        System.out.println("The average of grades: " + ((this.register.averageOfGrades() * 100.00) / 100));
    }

    public String printStars(int stars) {
        String printedStars = "";
        for (int i = 0; i < stars; i++) {
            printedStars = printedStars + "*";
        }
        return printedStars;
    }

    public String gradesToStars(int gradesCount) {
        return printStars(gradesCount);
    }
}
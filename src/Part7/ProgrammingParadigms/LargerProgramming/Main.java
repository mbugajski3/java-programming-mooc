package Part7.ProgrammingParadigms.LargerProgramming;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        int passingSum = 0;
        int passingCount = 0;

        int grade5count = 0;
        int grade4count = 0;
        int grade3count = 0;
        int grade2count = 0;
        int grade1count = 0;
        int grade0count = 0;

        System.out.println("Enter point totals, -1 stops: ");

        while(true) {
            String inputPoints = scaner.nextLine();

            if (inputPoints.equals("-1")) {
                break;
            }
            int points = Integer.valueOf(inputPoints);

            if (points >= 0 && points <= 100) {
                sum = sum + points;
                count++;

                if (points >= 50) {
                    passingSum = passingSum + points;
                    passingCount++;
                }

                if (points >= 90) {
                    grade5count++;
                } else if (points >= 80) {
                    grade4count++;
                } else if (points >= 70) {
                    grade3count++;
                } else if (points >= 60) {
                    grade2count++;
                } else if (points >= 50) {
                    grade1count++;
                } else {
                    grade0count++;
                }
            }
        }
        System.out.println("Point average (all): " + (double) sum / count);
        if (passingCount > 0) {
            System.out.println("Point average (passing): " + (double) passingSum / passingCount);
            System.out.println("Pass percentage: " + (double) 100 * passingCount / count);
        } else {
            System.out.println("Point average (passing):-");
            System.out.println("Pass percentage: 0.0");
        }
        System.out.println("Grade distribution: ");
        System.out.println("5: " + "*".repeat(grade5count));
        System.out.println("4: " + "*".repeat(grade4count));
        System.out.println("3: " + "*".repeat(grade3count));
        System.out.println("2: " + "*".repeat(grade2count));
        System.out.println("1: " + "*".repeat(grade1count));
        System.out.println("0: " + "*".repeat(grade0count));
    }
}

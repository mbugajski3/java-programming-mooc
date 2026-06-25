package Part5.OOPProgramming.ObjectsAndReferences;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        PersonTwin leo = new PersonTwin("Leo", date, 62, 9);
        PersonTwin lily = new PersonTwin("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        PersonTwin leoWithDifferentWeight = new PersonTwin("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
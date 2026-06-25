package Part4.ObjectsInList;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformationCollection {
    public static void main (String[] args) {
        ArrayList<PersonalInformation> personalInformations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String inputFirstName = scanner.nextLine();

            if (inputFirstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String inputLastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String inputIdentificationNumber = scanner.nextLine();
            personalInformations.add(new PersonalInformation(inputFirstName, inputLastName, inputIdentificationNumber));
        }
        for (PersonalInformation information : personalInformations) {
            System.out.println(information);
        }
    }
}

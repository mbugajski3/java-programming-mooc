import java.util.Scanner;
import java.util.ArrayList;

public class PersonalDetails {
    public static void main (String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();

        String longestName = "";
        int longestNameCount = 0;
        int yearSum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name: ");
            String inputName = scanner.nextLine();

            if (inputName.isEmpty()) {
                break;
            } else {
                System.out.println("Enter year of birth: ");
                String inputAge = scanner.nextLine();

                if (inputAge.isEmpty()) {
                    break;
                } else {
                    String inputResult = inputName + "," + inputAge;
                    String[] dividedInputResult = inputResult.split(",");
                    String name = dividedInputResult[0];
                    int yearOfBirth = Integer.valueOf(dividedInputResult[1]);
                    yearSum += yearOfBirth;

                    nameList.add(name);
                    yearList.add(yearOfBirth);

                    for (String personName : nameList) {
                        int nameCount = Integer.valueOf(personName.length());
                        if (nameCount > longestNameCount) {
                            longestNameCount = nameCount;
                            longestName = personName;

                        }
                    }
                }
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) yearSum / yearList.size()));
    }
}

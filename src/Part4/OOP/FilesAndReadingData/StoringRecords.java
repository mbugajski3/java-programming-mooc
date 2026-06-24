package Part4.OOP.FilesAndReadingData;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class StoringRecords {

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] linePieces = line.split(",");
                String name = linePieces[0];
                int age = Integer.valueOf(linePieces[1]);

                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
        }

        return persons;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = readRecordsFromFile("data.txt");

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
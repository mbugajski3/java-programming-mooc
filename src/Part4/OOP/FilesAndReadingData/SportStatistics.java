package Part4.OOP.FilesAndReadingData;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SportStatistics {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String inputFileName = scanner.nextLine();
        System.out.println("Team: ");
        String searchedTeam = scanner.nextLine().toLowerCase();

        int gameCount = 0;

        try (Scanner fileReader = new Scanner(Paths.get(inputFileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().toLowerCase();

                if (line.isEmpty()) {
                    continue;
                }
                String[] linePieces = line.split(",");
                String homeTeam = linePieces[0].toLowerCase();
                String visitingTeam = linePieces[1].toLowerCase();
                int homeTeamPoints = Integer.valueOf(linePieces[2]);
                int visitingTeamPoints = Integer.valueOf(linePieces[3]);

                for (String piece : linePieces) {
                    if (piece.equals(searchedTeam)) {
                        gameCount++;
                    }
                }
            }
            System.out.println("Games: " + gameCount);
        } catch (Exception e) {

        }
    }
}

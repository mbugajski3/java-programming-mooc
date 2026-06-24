package Part4.OOP.FilesAndReadingData;

import java.util.Scanner;
import java.nio.file.Paths;

public class SportStatistics {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String inputFileName = scanner.nextLine().trim();
        System.out.println("Team: ");
        String searchedTeam = scanner.nextLine().toLowerCase().trim();

        int gameCount = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(inputFileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().toLowerCase().trim();

                if (line.isEmpty()) {
                    continue;
                }
                String[] linePieces = line.split(",");
                String homeTeam = linePieces[0];
                String visitingTeam = linePieces[1];
                int homeTeamPoints = Integer.valueOf(linePieces[2]);
                int visitingTeamPoints = Integer.valueOf(linePieces[3]);

                if (searchedTeam.equals(homeTeam)) {
                    gameCount++;
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (searchedTeam.equals(visitingTeam)) {
                    gameCount++;
                    if (visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + inputFileName + " invalid.");
        }
    }
}

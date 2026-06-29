package Part7.ProgrammingParadigms.LargerProgramming;

import java.io.FileReader;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


public class RecipeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> recipes = new ArrayList<>();

        System.out.println("File to read: ");
        String inputFile = sc.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(inputFile))) {
            while (readFile.hasNextLine()) {
                String fileRow = readFile.nextLine();
                recipes.add(fileRow);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - search recipes by name");
        System.out.println("find cooking time - search recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println();
            System.out.println("Enter command: ");
            String inputCommand = sc.nextLine();
            System.out.println();

            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("list")) {
                for (String recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (inputCommand.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedWord = sc.nextLine();
                System.out.println();
                for (String recipe : recipes) {
                    if (recipe.contains(searchedWord)) {
                        System.out.println(recipe);
                    }
                }
            } else if (inputCommand.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                String inputMaxTime = sc.nextLine();

                for (String recipe : recipes) {
                    String[] recipeToParts = recipe.trim().split(",");
                    String[] timeToPieces = recipeToParts[1].trim().split(":");
                    int cookingTime = Integer.valueOf(timeToPieces[1].trim());
                    int maxTime = Integer.valueOf(inputMaxTime);

                    if (cookingTime <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (inputCommand.equals("find ingredient")) {
                System.out.println("Ingredient");
                String inputIngredient = sc.nextLine();

                for (String recipe : recipes) {
                    if (recipe.contains(inputIngredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}

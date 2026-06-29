package Part7.ProgrammingParadigms.Alghoritms;

import Part7.ProgrammingParadigms.Main;

import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int smallest = smallest(array);
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {

        int smallest = array[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int number1 = array[index1];
        int number2 = array[index2];

        array[index1] = number2;
        array[index2] = number1;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int smallestNumber = indexOfSmallestFrom(array, i);
            swap(array, smallestNumber, i);
        }
    }
}

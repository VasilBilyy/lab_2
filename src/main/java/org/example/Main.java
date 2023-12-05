package org.example;
import java.util.Random;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(10));
        }
        System.out.println("Original array: " + array);

        // Use BubbleSorter to sort the array
        MergeSorter mergeSorter = new MergeSorter();
        ArrayList<Integer> sortedArray = mergeSorter.sort(new ArrayList<>(array));

        // Display the sorted array
        System.out.println("Sorted array: " + sortedArray);
    }
}
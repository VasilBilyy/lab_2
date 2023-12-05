package org.example;
import java.util.Random;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(10));
        }
        System.out.println("Original array: " + array);


        QuickSorter quickSorter = new QuickSorter();
        ArrayList<Integer> sortedArray = quickSorter.sort(new ArrayList<>(array));

        System.out.println("Sorted array: " + sortedArray);
    }
}
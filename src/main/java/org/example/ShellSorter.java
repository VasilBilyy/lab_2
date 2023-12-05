package org.example;

import java.util.ArrayList;

public class ShellSorter implements Sorter{
    public ArrayList<Integer> sort(ArrayList<Integer> input){
        ArrayList<Integer> sortedArray = new ArrayList<>(input);
        int n = sortedArray.size();

        for (int gap = n / 2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i++){
                int key = sortedArray.get(i);
                int j = i;
                while (j >= gap && sortedArray.get(i - gap) > key){
                    sortedArray.set(j, sortedArray.get(j - gap));
                    j -= gap;
                }
            }
        }

        return sortedArray;
    }
}

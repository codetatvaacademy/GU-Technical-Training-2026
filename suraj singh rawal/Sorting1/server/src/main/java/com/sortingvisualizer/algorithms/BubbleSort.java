package com.sortingvisualizer.algorithms;

import java.util.List;

public class BubbleSort {
    public static List<Integer> sort(List<Integer> array) {
        int n = array.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}

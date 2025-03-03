package com.sortingvisualizer.algorithms;

import java.util.List;

public class InsertionSort {
    public static List<Integer> sort(List<Integer> array) {
        int n = array.size();
        for (int i = 1; i < n; i++) {
            int key = array.get(i);
            int j = i - 1;

            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, key);
        }
        return array;
    }
}

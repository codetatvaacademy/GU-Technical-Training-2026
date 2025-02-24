package com.sortingvisualizer.algorithms;

import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static List<Integer> sort(List<Integer> array) {
        if (array.size() <= 1) return array;
        int mid = array.size() / 2;

        List<Integer> left = new ArrayList<>(array.subList(0, mid));
        List<Integer> right = new ArrayList<>(array.subList(mid, array.size()));

        return merge(sort(left), sort(right));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        while (i < left.size()) merged.add(left.get(i++));
        while (j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}

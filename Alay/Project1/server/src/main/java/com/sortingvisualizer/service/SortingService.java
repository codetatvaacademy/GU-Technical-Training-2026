package com.sortingvisualizer.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SortingService {

    private static final Logger logger = LoggerFactory.getLogger(SortingService.class);

    public List<List<Integer>> sort(String algorithm, List<Integer> array) {
        List<List<Integer>> steps = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(array);

        logger.info("Sorting started with algorithm: {}", algorithm);

        switch (algorithm.toLowerCase()) {
            case "quick":
                quickSort(arr, 0, arr.size() - 1, steps);
                break;
            case "merge":
                mergeSort(arr, 0, arr.size() - 1, steps);
                break;
            case "selection":
                selectionSort(arr, steps);
                break;
            case "bubble":
                bubbleSort(arr, steps);
                break;
            case "insertion":
                insertionSort(arr, steps);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting algorithm: " + algorithm);
        }

        logger.info("Sorting completed for algorithm: {}", algorithm);
        return steps;
    }

    private void quickSort(List<Integer> arr, int low, int high, List<List<Integer>> steps) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, steps);
            quickSort(arr, low, pivotIndex - 1, steps);
            quickSort(arr, pivotIndex + 1, high, steps);
        }
    }

    private int partition(List<Integer> arr, int low, int high, List<List<Integer>> steps) {
        int pivot = arr.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;
                swap(arr, i, j);
                steps.add(new ArrayList<>(arr));
            }
        }
        swap(arr, i + 1, high);
        steps.add(new ArrayList<>(arr));
        return i + 1;
    }

    private void mergeSort(List<Integer> arr, int l, int r, List<List<Integer>> steps) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid, steps);
            mergeSort(arr, mid + 1, r, steps);
            merge(arr, l, mid, r, steps);
        }
    }

    private void merge(List<Integer> arr, int l, int m, int r, List<List<Integer>> steps) {
        List<Integer> temp = new ArrayList<>(arr);
        int i = l, j = m + 1, k = l;

        while (i <= m && j <= r) {
            if (temp.get(i) <= temp.get(j)) {
                arr.set(k++, temp.get(i++));
            } else {
                arr.set(k++, temp.get(j++));
            }
            steps.add(new ArrayList<>(arr));
        }

        while (i <= m) {
            arr.set(k++, temp.get(i++));
            steps.add(new ArrayList<>(arr));
        }

        while (j <= r) {
            arr.set(k++, temp.get(j++));
            steps.add(new ArrayList<>(arr));
        }
    }

    private void selectionSort(List<Integer> arr, List<List<Integer>> steps) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIdx)) {
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                swap(arr, i, minIdx);
                steps.add(new ArrayList<>(arr));
            }
        }
    }

    private void bubbleSort(List<Integer> arr, List<List<Integer>> steps) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap(arr, j, j + 1);
                    steps.add(new ArrayList<>(arr));
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private void insertionSort(List<Integer> arr, List<List<Integer>> steps) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
                steps.add(new ArrayList<>(arr));
            }
            arr.set(j + 1, key);
            steps.add(new ArrayList<>(arr));
        }
    }

    private void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}

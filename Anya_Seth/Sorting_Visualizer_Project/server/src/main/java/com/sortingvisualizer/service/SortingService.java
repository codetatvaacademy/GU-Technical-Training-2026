package com.sortingvisualizer.service;

import com.sortingvisualizer.algorithms.MergeSort;
import com.sortingvisualizer.algorithms.QuickSort;
import com.sortingvisualizer.algorithms.SelectionSort;
import com.sortingvisualizer.algorithms.BubbleSort;
import com.sortingvisualizer.algorithms.InsertionSort;
import com.sortingvisualizer.model.SortingResponse;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SortingService {

    public SortingResponse sort(String algorithm, List<Integer> array) {
        System.out.println("Received sorting request for: " + algorithm);

        List<Integer> sortedArray;
        switch (algorithm.toLowerCase()) {
            case "quicksort":
                sortedArray = QuickSort.sort(array);
                break;
            case "mergesort":
                sortedArray = MergeSort.sort(array);
                break;
            case "selectionsort":
                sortedArray = SelectionSort.sort(array);
                break;
            case "bubblesort":
                sortedArray = BubbleSort.sort(array);
                break;
            case "insertionsort":
                sortedArray = InsertionSort.sort(array);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting algorithm: " + algorithm);
        }
        return new SortingResponse(sortedArray);
    }
}

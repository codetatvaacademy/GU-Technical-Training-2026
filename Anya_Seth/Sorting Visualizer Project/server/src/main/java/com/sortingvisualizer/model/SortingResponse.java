package com.sortingvisualizer.model;

import java.util.List;

public class SortingResponse {
    private List<Integer> sortedArray;

    public SortingResponse(List<Integer> sortedArray) {
        this.sortedArray = sortedArray;
    }

    public List<Integer> getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(List<Integer> sortedArray) {
        this.sortedArray = sortedArray;
    }
}

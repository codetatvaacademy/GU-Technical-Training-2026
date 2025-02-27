package com.sortingvisualizer.model;

import java.util.List;

public class SortingRequest {
    private String algorithm;
    private List<Integer> array;

    public SortingRequest() {}

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }
}

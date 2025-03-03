package com.sortingvisualizer.model;

import java.util.List;

public class SortingRequest {
    private String algorithm;
    private List<Integer> numbers; // Ensure it matches the frontend request field

    public SortingRequest() {} // Default constructor required

    public SortingRequest(String algorithm, List<Integer> array) {
        this.algorithm = algorithm;
        this.numbers = array;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<Integer> getArray() {
        return numbers;
    }

    public void setArray(List<Integer> array) {
        this.numbers = array;
    }

    @Override
    public String toString() {
        return "SortingRequest{" +
                "algorithm='" + algorithm + '\'' +
                ", array=" + numbers +
                '}';
    }
}

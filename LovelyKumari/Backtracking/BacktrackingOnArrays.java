import java.util.*;

public class BacktrackingOnArrays {
    public static void changeArr(int[] arr, int i, int val) {
        if (i == arr.length) { // Base case: If index reaches end, print array
            printArr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; // Backtracking step
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int size = 5;
        int arr[] = new int[size]; 
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
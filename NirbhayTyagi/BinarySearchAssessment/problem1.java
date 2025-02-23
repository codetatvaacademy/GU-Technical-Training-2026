package BinarySearchAssessment;

import java.util.Scanner;
class problem1 {
    public static int numberOfOccurrences(int[] arr, int target) {
        int firstOccurence = first(arr, target);
        int lastOccurence = second(arr, target);
        return (lastOccurence - firstOccurence) < 0 ? -1: lastOccurence - firstOccurence;
    }
    private static int first(int[] arr, int target) {
        int starting = 0;
        int  ending = arr.length;
        while (starting < ending) {
            int mid = (starting + ending) / 2;
            if (arr[mid] >= target) {
                ending = mid;
            }
            else {
                starting = mid + 1;
            }
        }
        return starting;
    }
    private static int second(int[] arr, int target) {
        int starting = 0;
        int ending = arr.length;
        while (starting < ending) {
            int mid = (starting + ending) / 2;
            if (arr[mid] <= target) {
                starting = mid + 1;
            } else{
                ending = mid;
            }
        }
        return starting;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in a sorted order:");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println("Number of " + target + ": " + numberOfOccurrences(arr, target));
        sc.close();
    }
}

//Complexity of whole program:
//Time: O(n) + O(log n)
//Space: O(n)

//Complexity of function:
//Time: O(log n)
//Space: O(1)

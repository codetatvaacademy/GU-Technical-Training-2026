import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int index = 0;
        int current = 1;

        while (count < k) {
            if (index >= arr.length || arr[index] != current) {
                count++;
            } else {
                index++;
            }
            if (count == k) {
                return current;
            }
            current++;
        }
        return -1;
    }
}

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.findKthPositive(arr, k);

        System.out.println("The " + k + "th missing positive number is: " + result);

        scanner.close();
    }
}

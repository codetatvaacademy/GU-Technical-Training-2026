package Sorting;

import java.util.*;

public class minimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        int maxEle = Integer.MIN_VALUE;
        for (int num : nums) {
            maxEle = Math.max(maxEle, num);
        }

        int extra = 0;
        int moves = 0;
        int[] arr = new int[nums.length + maxEle];

        for (int num : nums) {
            arr[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                extra = arr[i] - 1;
                arr[i + 1] += extra;
                moves += extra;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        minimumIncrementToMakeArrayUnique obj = new minimumIncrementToMakeArrayUnique();
        int result = obj.minIncrementForUnique(nums);

        System.out.println("Minimum increments to make array unique: " + result);
    }
}

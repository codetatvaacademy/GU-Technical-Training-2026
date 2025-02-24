package Sorting;

import java.util.*;

public class maximumSumObtainedOfAnyPermutation {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length + 1];

        for (int i = 0; i < requests.length; i++) {
            arr[requests[i][0]] += 1;
            arr[requests[i][1] + 1] -= 1;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        Arrays.sort(arr);

        long sum = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            long a = nums[i - 1];
            long b = arr[i];
            long ans = a * b;
            sum += ans;
        }

        return (int) (sum % 1000000007);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in nums
        System.out.print("Enter the number of elements in nums: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of nums:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the number of requests
        System.out.print("Enter the number of requests: ");
        int m = scanner.nextInt();
        int[][] requests = new int[m][2];

        System.out.println("Enter the requests (start and end indices):");
        for (int i = 0; i < m; i++) {
            requests[i][0] = scanner.nextInt();
            requests[i][1] = scanner.nextInt();
        }

        scanner.close();

        maximumSumObtainedOfAnyPermutation obj = new maximumSumObtainedOfAnyPermutation();
        int result = obj.maxSumRangeQuery(nums, requests);

        System.out.println("Maximum sum obtained: " + result);
    }
}

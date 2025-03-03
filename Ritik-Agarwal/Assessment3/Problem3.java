// Used Binary Search Approach
// Time Complexity -> O(n + nlogn) = O(nlogn) : Binary search - O(logn) ; isPossible() function - O(n)
// Space Complexity -> O(1)

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minimizeLongestSum(n, k, nums));
    }

    private static int minimizeLongestSum(int n, int k, int[] nums) { // O(n+nlogn)
        int start = nums[0];
        int end = nums[0];

        for (int i : nums) { // O(n)
            end += i;
            if (i < start) {
                start = i;
            }
        }

        while (start <= end) { // O(nlogn)
            int mid = (start + end) / 2;
            if (isPossible(mid, nums, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static boolean isPossible(int mid, int[] nums, int k) { // O(n)
        int sum = 0;
        k--;
        for (int i : nums) {
            sum += i;
            if (sum > mid) {
                k--;
                sum = i;
            }
        }
        return k >= 0;
    }
}
import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];

        prefixSum[0] = nums[0];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        suffixSum[nums.length - 1] = nums[nums.length - 1];
        for (int i = suffixSum.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                return i;
            }
        }
        return -1;
    }
}

public class findPivotIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int pivotIndex = solution.pivotIndex(nums);

        System.out.println("The pivot index is: " + pivotIndex);

        scanner.close();
    }
}

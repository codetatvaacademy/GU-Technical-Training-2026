import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            int leftSum = prefixSum;
            int rightSum = totalSum - prefixSum - nums[i];
            result[i] = nums[i] * i - leftSum + rightSum - nums[i] * (n - i - 1);
            prefixSum += nums[i];
        }
        
        return result;
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
        
        Solution solution = new Solution();
        int[] result = solution.getSumAbsoluteDifferences(nums);
        
        System.out.println("Resultant array: " + Arrays.toString(result));
        
        scanner.close();
    }
}
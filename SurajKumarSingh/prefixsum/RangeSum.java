//LeetCode --> 303

package prefixsum;

import java.util.Scanner;

public class RangeSum {

    int [] nums;
    public RangeSum(int[] nums) {
        this.nums = nums;
        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        return left == 0 ? nums[right] : nums[right] - nums[left - 1];
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        RangeSum rangeSum = new RangeSum(nums);

        
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter the left and right indices for the sum range (0-based): ");
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int result = rangeSum.sumRange(left, right);
            System.out.println("Sum from index " + left + " to " + right + " is: " + result);
        }

        scanner.close();  
    }
}

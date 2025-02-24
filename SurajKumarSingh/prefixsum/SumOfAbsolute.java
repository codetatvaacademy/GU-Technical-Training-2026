//LeetCode --> 1685

package prefixsum;

import java.util.Scanner;

public class SumOfAbsolute {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n + 1]; 


        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        
        for (int i = 0; i < n; i++) {
    
            int leftCount = i;

            int rightCount = n - i - 1;

            result[i] = (nums[i] * leftCount - prefixSum[i]) + 
                        (prefixSum[n] - prefixSum[i + 1] - nums[i] * rightCount);
        }

        return result;
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

        
        SumOfAbsolute sumOfAbsolute = new SumOfAbsolute();


        int[] result = sumOfAbsolute.getSumAbsoluteDifferences(nums);

        
        System.out.println("The sum of absolute differences is:");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}

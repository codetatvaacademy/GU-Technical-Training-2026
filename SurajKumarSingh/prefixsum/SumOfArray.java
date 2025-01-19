// Leetcode --> 1480
package prefixsum;

import java.util.Scanner;

public class SumOfArray{
    public int[] runningSum(int[] nums) {
        int n = nums.length;
         for(int i = 1; i< n; i++){
          nums[i] += nums[i-1];
         } 
         return nums; 
    }

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

      
        int[] nums = new int[size];

    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

      
        SumOfArray sumOfArray = new SumOfArray();
        int[] result = sumOfArray.runningSum(nums);

    
        System.out.println("Running sum of the array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
     }
  }
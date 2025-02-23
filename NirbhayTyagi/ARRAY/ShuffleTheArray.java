package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray{
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < n; i++){
         ans[i * 2] = nums[i];
         ans[i * 2 + 1] = nums[i + n];
        } 
 
        return ans;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int k = sc.nextInt();
        System.out.println("Enter the value of 'n':");
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < k; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The answer array is  " + Arrays.toString(shuffle(nums, n)));
    }
}
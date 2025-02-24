package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray{
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in an array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
             nums[i] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
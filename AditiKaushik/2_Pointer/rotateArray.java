// 189. Rotate Array

import java.util.Arrays;
import java.util.Scanner;

class rotateArray{
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int offset = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, offset - 1);
        reverse(nums, offset, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0; i< n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("By how many steps you want to rotate the array to the right: ");
        int k = sc.nextInt();
        rotate(nums, k);
        sc.close();
    }
}

//Time Complexity: O(n)
//Spce Complexity: O(1)
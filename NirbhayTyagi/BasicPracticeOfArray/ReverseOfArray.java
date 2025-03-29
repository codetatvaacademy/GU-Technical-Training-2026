package BasicPracticeOfArray;

import java.util.Scanner;

class ReverseOfArray {
    public static void reverse(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;            
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        reverse(nums);
        System.out.println("Reversed array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

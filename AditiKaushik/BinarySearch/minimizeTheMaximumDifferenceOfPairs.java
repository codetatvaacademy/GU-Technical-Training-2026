// 2616. Minimize the Maximum Difference of Pairs

import java.util.Arrays;
import java.util.Scanner;

class minimizeTheMaximumDifferenceOfPairs{
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int min = 0;
        int max = nums[nums.length - 1] - nums[0];
        while (min <= max) {
            int count = 0;
            int mid = min + (max - min) / 2;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    count++;
                    i++;
                }
            }
            if (count >= p) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of pairs you want to find: ");
        int p = sc.nextInt();
        System.out.println(minimizeMax(nums, p));
        sc.close();
    }
}

//Time Complexity: O(N log N + N log D) where D is the difference between the maximum and minimum value in nums
//Space Complexity: O(1)
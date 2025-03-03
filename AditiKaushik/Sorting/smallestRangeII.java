// 910. Smallest Range II

import java.util.Arrays;
import java.util.Scanner;

class smallestRangeII{
    public static int smallestRange2(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums[nums.length - 1] - nums[0];
        int bestL = nums[0] + k;
        int bestR = nums[nums.length - 1] - k;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(bestL, nums[i + 1] - k);
            max = Math.max(bestR, nums[i] + k);
            res = Math.min(res, max - min);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter an integer: ");
        int k = sc.nextInt();
        System.out.println(smallestRange2(nums, k));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)
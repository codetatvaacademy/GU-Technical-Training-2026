// 1679. Max Number of K-Sum Pairs

import java.util.Arrays;
import java.util.Scanner;

class maxNumberOf_K_SumPairs{
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int answer = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                ++answer;
                ++left;
                --right;
            } else if (sum > k) {
                --right;
            } else {
                ++left;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter sum: ");
        int k = sc.nextInt();
        System.out.println(maxOperations(nums, k));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)
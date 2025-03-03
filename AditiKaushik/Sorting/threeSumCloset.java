// 16. 3Sum Closest

import java.util.Arrays;
import java.util.Scanner;

class threeSumCloset{
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if(Math.abs(nums[i] + nums[j] + nums[k] - target) < diff){
                    diff = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    sum = nums[i] + nums[j] + nums[k];
                }
                if (nums[i] + nums[j] + nums[k] < target) {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return sum;
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
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(threeSumClosest(nums, target));
        sc.close();
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
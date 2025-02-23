// 945. Minimum Increment to Make Array Unique

import java.util.Scanner;

class minimumIncrementToMakeArrayUnique {
    public static int minIncrementForUnique(int[] nums) {
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        int[] arr = new int[nums.length + maxNum];
        for (int i : nums) {
            ++arr[i];
        }
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) {
                continue;
            }
            int count = arr[i] - 1;
            arr[i + 1] += count;
            min += count;
        }
        return min;
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
        System.out.println("The minimum number of moves to make every value unique: " + minIncrementForUnique(nums));
        sc.close();
    }
}

//Time Complexity: O(n + maxNum)
//Space Complexity: O(n + maxNum)
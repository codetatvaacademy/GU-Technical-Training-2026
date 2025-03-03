// 462. Minimum Moves to Equal Array Elements II

import java.util.Arrays;
import java.util.Scanner;

class minimumMovesToEqualArrayElementsII{
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            moves += nums[j--] - nums[i++];
        }
        return moves;
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
        System.out.println(minMoves2(nums));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)
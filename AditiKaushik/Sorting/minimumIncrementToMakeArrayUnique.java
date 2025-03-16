// 945. Minimum Increment to Make Array Unique

import java.util.Scanner;

class minimumIncrementToMakeArrayUnique{
    public static int minIncrementForUnique(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            if (max < x)
                max = x;
        }
        int[] f = new int[max + 1];
        for (int x : nums) {
            f[x]++;
        }
        int ans = 0;
        for (int i = 0; i < max; i++) {
            if (f[i] > 1) {
                f[i + 1] += f[i] - 1;
                ans += f[i] - 1;
            }
        }
        ans += (f[max] - 1) * f[max] / 2;
        return ans;
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
        System.out.println(minIncrementForUnique(nums));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
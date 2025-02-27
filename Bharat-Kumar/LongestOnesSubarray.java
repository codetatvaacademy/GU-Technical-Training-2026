import java.util.*;

public class LongestOnesSubarray {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, start = 0, maxLength = 0, zeros = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LongestOnesSubarray sol = new LongestOnesSubarray();
        System.out.println(sol.longestOnes(nums, k));

        sc.close();
    }
}

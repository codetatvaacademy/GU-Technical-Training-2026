import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i];
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (i % k == k - 1 || i == n - 1) {
                rightMax[i] = nums[i];
            } else {
                rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SlidingWindowMaximum sol = new SlidingWindowMaximum();
        int[] result = sol.maxSlidingWindow(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

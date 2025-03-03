import java.util.Scanner;
import java.util.Arrays;

public class slidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        int[] result = new int[nums.length - k + 1];
        leftMax[0] = nums[0];

        for (int i = 0; i < nums.length; ++i) {
            if (i % k == 0)
                leftMax[i] = nums[i];
            else
                leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; --i) {
            if (i == nums.length - 1 || (i + 1) % k == 0)
                rightMax[i] = nums[i];
            else
                rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        for (int i = 0; i < nums.length - k + 1; ++i) {
            result[i] = Math.max(leftMax[i + k - 1], rightMax[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the window size k: ");
        int k = scanner.nextInt();

        scanner.close();

        slidingWindowMaximum obj = new slidingWindowMaximum();
        int[] result = obj.maxSlidingWindow(nums, k);

        System.out.println("Sliding window maximums: " + Arrays.toString(result));
    }
}

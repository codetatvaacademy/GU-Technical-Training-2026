import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
        int[] answer = new int[nums.length - k + 1];

        for (int start = 0; start < nums.length; start += k) {
            int end = Math.min(start + k - 1, nums.length - 1);

            for (int i = start; i <= end; i++) {
                if (i == start) {
                    leftMax[i] = nums[i];
                } else {
                    leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
                }
            }

            for (int i = end; i >= start; i--) {
                if (i == end) {
                    rightMax[i] = nums[i];
                } else {
                    rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int[] result = solution.maxSlidingWindow(nums, k);

        System.out.println("Maximum elements in each sliding window: " + Arrays.toString(result));

        scanner.close();
    }
}

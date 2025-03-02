import java.util.*;

public class MinOperationsToReduceX {
    public int minOperations(int[] nums, int x) {
        x = -x;
        for (int num : nums) {
            x += num;
        }
        if (x < 0) return -1;

        int start = 0, end = 0, maxLength = -1;

        while (end < nums.length) {
            x -= nums[end];
            while (x < 0) {
                x += nums[start];
                start++;
            }
            if (x == 0) {
                maxLength = Math.max(maxLength, (end - start) + 1);
            }
            end++;
        }
        return (maxLength == -1) ? maxLength : nums.length - maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MinOperationsToReduceX sol = new MinOperationsToReduceX();
        System.out.println(sol.minOperations(nums, x));

        sc.close();
    }
}

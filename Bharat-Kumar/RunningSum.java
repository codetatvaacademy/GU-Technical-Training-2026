import java.util.*;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++)
            nums[i] += nums[i - 1]; // Prefix sum calculation
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}

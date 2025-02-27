import java.util.*;

public class MaximumUniqueSubarray {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int l = 0, maxSum = 0, currSum = 0;

        for (int i = 0; i < n; i++) {
            while (set.contains(nums[i])) {
                set.remove(nums[l]);
                currSum -= nums[l];
                l++;
            }
            set.add(nums[i]);
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaximumUniqueSubarray sol = new MaximumUniqueSubarray();
        System.out.println(sol.maximumUniqueSubarray(nums));

        sc.close();
    }
}

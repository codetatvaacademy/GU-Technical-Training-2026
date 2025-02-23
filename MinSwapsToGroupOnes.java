import java.util.*;

public class MinSwapsToGroupOnes {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        for (int num : nums) {
            totalOnes += num;
        }
        int start = 0, end = 0, ones = nums[0], ans = totalOnes;

        while (start < nums.length) {
            if (start != 0) {
                ones -= nums[start - 1];
            }
            while (end - start + 1 < totalOnes) {
                end++;
                ones += nums[end % nums.length];
            }
            ans = Math.min(ans, totalOnes - ones);
            ++start;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MinSwapsToGroupOnes sol = new MinSwapsToGroupOnes();
        System.out.println(sol.minSwaps(nums));

        sc.close();
    }
}

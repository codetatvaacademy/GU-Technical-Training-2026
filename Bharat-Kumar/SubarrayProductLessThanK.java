import java.util.*;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, product = 1, l = 0;
        if (k < 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            while (product >= k && l <= i) {
                product /= nums[l];
                l++;
            }
            count += i - l + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SubarrayProductLessThanK sol = new SubarrayProductLessThanK();
        System.out.println(sol.numSubarrayProductLessThanK(nums, k));

        sc.close();
    }
}

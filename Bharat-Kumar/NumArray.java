import java.util.*;

public class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++)
            prefixSum[i + 1] = prefixSum[i] + nums[i];
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        NumArray obj = new NumArray(nums);

        int q = sc.nextInt(); // Number of queries
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt(), right = sc.nextInt();
            System.out.println(obj.sumRange(left, right));
        }

        sc.close();
    }
}

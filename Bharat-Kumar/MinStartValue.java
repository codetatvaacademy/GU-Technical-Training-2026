import java.util.*;

public class MinStartValue {
    public static int minStartValue(int[] nums) {
        int sum = 0, minSum = 0;
        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(minStartValue(nums));
        sc.close();
    }
}

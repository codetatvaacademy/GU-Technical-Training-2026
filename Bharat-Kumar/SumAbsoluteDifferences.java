import java.util.*;

public class SumAbsoluteDifferences {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length, leftSum = 0, rightSum = 0;
        for (int num : nums) rightSum += num;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            result[i] = nums[i] * i - leftSum + rightSum - nums[i] * (n - i - 1);
            leftSum += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] result = getSumAbsoluteDifferences(nums);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}

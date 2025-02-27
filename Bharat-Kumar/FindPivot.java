import java.util.*;

public class FindPivot {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for (int num : nums) totalSum += num;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i])
                return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(pivotIndex(nums));
        sc.close();
    }
}

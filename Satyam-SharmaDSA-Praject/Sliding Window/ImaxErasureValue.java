import java.util.Scanner;

public class ImaxErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] lastIndex = new int[10001];
        int i = 0;
        int maxSum = 0, currentSum = 0;
        for (int j = 0; j < n; j++) {
            int num = nums[j];
            if (lastIndex[num] > 0) {
                while (i < lastIndex[num]) {
                    currentSum -= nums[i];
                    i++;
                }
            }
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            lastIndex[num] = j + 1;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumUniqueSubarray(nums));
    }
}

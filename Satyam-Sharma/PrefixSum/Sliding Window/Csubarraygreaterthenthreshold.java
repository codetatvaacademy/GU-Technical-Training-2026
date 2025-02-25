import java.util.Scanner;

public class Csubarraygreaterthenthreshold {
    public static int numOfSubarrays(int[] nums, int k, int threshold) {
        threshold = threshold * k;
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        for (j = 0; j < k; j++) {
            sum += nums[j];
        }
        if (sum >= threshold) {
            count++;
        }
        while (j < nums.length) {
            sum = sum - nums[i] + nums[j];
            if (sum >= threshold) {
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(numOfSubarrays(nums, k, threshold));
    }
}

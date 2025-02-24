import java.util.Scanner;

public class LsubarrayproductlessthenK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int product = 1;
        while (j < nums.length) {
            product *= nums[j];
            while (i <= j && product >= k) {
                product /= nums[i];
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}

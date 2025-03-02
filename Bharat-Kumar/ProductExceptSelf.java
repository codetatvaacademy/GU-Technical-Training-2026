import java.util.*;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        
        int left = 1, right = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= left;
            left *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}

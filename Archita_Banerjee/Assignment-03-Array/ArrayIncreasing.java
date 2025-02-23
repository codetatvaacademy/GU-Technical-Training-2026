import java.util.Scanner;
public class ArrayIncreasing {
    public static int minOperations(int[] nums) {
        int opr = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int inc = (nums[i - 1] + 1) - nums[i];
                nums[i] = nums[i - 1] + 1;
                opr += inc;
            }
        }
        return opr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = minOperations(nums);
        System.out.println("Minimum number of operations to make the array strictly increasing: " + result);
    }
}

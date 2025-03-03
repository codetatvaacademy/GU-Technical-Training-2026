import java.util.Scanner;

public class UsubarrayWithBoundedMax {
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int prev = 0;
        int count = 0;
        int end = 0;
        int start = 0;
        while (end < nums.length) {
            if (left <= nums[end] && nums[end] <= right) {
                prev = end - start + 1;
                count += prev;
            } else if (left > nums[end]) {
                count += prev;
            } else {
                start = end + 1;
                prev = 0;

            }
            end++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the left bound: ");
        int left = sc.nextInt();
        System.out.println("Enter the right bound: ");
        int right = sc.nextInt();
        System.out.println(numSubarrayBoundedMax(nums, left, right));
    }
}

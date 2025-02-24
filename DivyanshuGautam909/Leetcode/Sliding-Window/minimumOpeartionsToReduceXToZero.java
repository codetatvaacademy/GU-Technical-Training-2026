import java.util.Scanner;

public class minimumOpeartionsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        x = -x;

        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
        }

        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return nums.length;
        }

        while (end < nums.length) {
            x -= nums[end];

            while (x < 0) {
                x += nums[start++];
            }

            if (x == 0) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
            end++;
        }
        return maxLength == 0 ? -1 : (nums.length - maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        scanner.close();

        minimumOpeartionsToReduceXToZero obj = new minimumOpeartionsToReduceXToZero();
        int result = obj.minOperations(nums, x);
        System.out.println("Minimum operations to reduce x to zero: " + result);
    }
}

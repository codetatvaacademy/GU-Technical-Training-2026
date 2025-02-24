import java.util.Scanner;
import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero++] = nums[i];
            }
        }

        for (int i = nonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
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

        scanner.close();

        MoveZeros obj = new MoveZeros();
        obj.moveZeroes(nums);

        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }
}

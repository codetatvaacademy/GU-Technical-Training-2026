import java.util.Scanner;
import java.util.Arrays;

public class removeDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        removeDuplicateFromSortedArray obj = new removeDuplicateFromSortedArray();
        int newLength = obj.removeDuplicates(nums);

        System.out.println("New length of array after removing duplicates: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

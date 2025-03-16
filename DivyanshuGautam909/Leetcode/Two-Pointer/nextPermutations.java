import java.util.Scanner;
import java.util.Arrays;

public class nextPermutations {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            int swapIdx = -1;
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    swapIdx = i;
                    break;
                }
            }
            int temp = nums[pivot];
            nums[pivot] = nums[swapIdx];
            nums[swapIdx] = temp;
        }
        reverse(nums, pivot + 1, n - 1);
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

        nextPermutations obj = new nextPermutations();
        obj.nextPermutation(nums);

        System.out.println("Next permutation of the array: " + Arrays.toString(nums));
    }
}

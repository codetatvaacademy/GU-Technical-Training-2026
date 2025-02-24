import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);

        System.out.println("The target should be inserted at index: " + result);

        scanner.close();
    }
}

import java.util.Scanner;

public class specialArrayWithXElementGreaterThanOrEqualX {
    private int isValid(int[] nums, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mid <= nums[i]) {
                count++;
            }
        }
        return count;
    }

    public int specialArray(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            int count = isValid(nums, mid);
            if (count == mid) {
                return mid;
            }
            if (count > mid) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        specialArrayWithXElementGreaterThanOrEqualX obj = new specialArrayWithXElementGreaterThanOrEqualX();
        int result = obj.specialArray(nums);

        System.out.println("Special array result: " + result);
    }
}

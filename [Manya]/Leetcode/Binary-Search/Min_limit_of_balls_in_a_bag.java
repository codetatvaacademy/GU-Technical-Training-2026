import java.util.Scanner;

class Solution {
    public boolean isValid(int[] nums, int mid, int maxOperations) {
        int op = 0;
        for (int num : nums) {
            op += (num / mid) - (num % mid == 0 ? 1 : 0); 
            if (op > maxOperations) return false; 
        }
        return op <= maxOperations;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int min = 1, max = 0;

        for (int num : nums) {
            max = Math.max(num, max);
        }

        while (min < max) {
            int mid = (min + max) / 2;
            if (isValid(nums, mid, maxOperations)) {
                max = mid; 
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter max operations: ");
        int maxOperations = scanner.nextInt();

        Solution sol = new Solution();
        int result = sol.minimumSize(nums, maxOperations);
        System.out.println("Minimum bag size: " + result);

        scanner.close();
    }
}

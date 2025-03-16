import java.util.Scanner;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countSubarraysWithAtMostK(nums, k) - countSubarraysWithAtMostK(nums, k - 1);
    }

    private int countSubarraysWithAtMostK(int[] nums, int k) {
        int left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                k--;
            }

            while (k < 0) {
                if (nums[left] % 2 == 1) {
                    k++;
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays: " + result);

        scanner.close();
    }
}

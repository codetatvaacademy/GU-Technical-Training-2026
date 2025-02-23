import java.util.Scanner;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, sum = 0, minLength = nums.length + 1;

        while (end < nums.length) {
            sum += nums[end];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.minSubArrayLen(target, nums);

        System.out.println("Minimum length of subarray with sum ≥ target: " + result);

        scanner.close();
    }
}

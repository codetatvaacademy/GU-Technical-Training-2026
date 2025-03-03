import java.util.Scanner;

class Solution {

    private boolean isPossible(int[] nums, int divisor, int threshold) {
        for (int num : nums) {
            threshold -= (num + divisor - 1) / divisor; 
            if (threshold < 0) return false; 
        }
        return true;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int minDivisor = 1, maxDivisor = 0;

        for (int num : nums) {
            maxDivisor = Math.max(maxDivisor, num);
        }

        while (minDivisor < maxDivisor) {
            int divisor = minDivisor + (maxDivisor - minDivisor) / 2;

            if (isPossible(nums, divisor, threshold)) {
                maxDivisor = divisor;
            } else {
                minDivisor = divisor + 1;
            }
        }

        return minDivisor;
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

        System.out.print("Enter threshold: ");
        int threshold = scanner.nextInt();

        Solution sol = new Solution();
        int result = sol.smallestDivisor(nums, threshold);
        System.out.println("Smallest divisor: " + result);

        scanner.close();
    }
}

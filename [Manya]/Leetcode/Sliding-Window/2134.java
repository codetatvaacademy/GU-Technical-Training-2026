import java.util.Scanner;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 1) countOnes++;
        }

        if (countOnes == 0 || countOnes == n) return 0;

        int[] extended = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            extended[i] = nums[i % n]; 
        }

        int minZeros = Integer.MAX_VALUE;
        int currentZeros = 0;

        for (int i = 0; i < countOnes; i++) {
            if (extended[i] == 0) currentZeros++;
        }
        minZeros = currentZeros;

        for (int i = countOnes; i < 2 * n; i++) {
            if (extended[i] == 0) currentZeros++; 
            if (extended[i - countOnes] == 0) currentZeros--; 
            minZeros = Math.min(minZeros, currentZeros);
        }

        return minZeros;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements (0 or 1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.minSwaps(nums);
        
        System.out.println("Minimum swaps required: " + result);

        scanner.close();
    }
}

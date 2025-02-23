import java.util.Scanner;

class Solution {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int currSum = 0;

        for(int num : nums){
            currSum += num;
            minSum = Math.min(minSum, currSum);
        }
        return 1 - minSum;
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
        
        Solution solution = new Solution();
        int result = solution.minStartValue(nums);
        System.out.println("The minimum start value is: " + result);
        
        scanner.close();
    }
}

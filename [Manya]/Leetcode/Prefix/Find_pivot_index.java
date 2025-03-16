import java.util.Scanner;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
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
        
        Solution solution = new Solution();
        int result = solution.pivotIndex(nums);
        System.out.println("The pivot index is: " + result);
        
        scanner.close();
    }
}

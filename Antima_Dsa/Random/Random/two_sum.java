public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;          // Left pointer
        int right = nums.length - 1; // Right pointer
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[] {left + 1, right + 1}; // Return 1-based indices
            } else if (sum < target) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
        
        // If no solution exists (not needed as per problem statement, but included for safety)
        return new int[] {-1, -1};
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

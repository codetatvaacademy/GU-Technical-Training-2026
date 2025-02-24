public class product_of_array_except_self {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int prefix = 1;
            int suffix = 1;
            int[] result = new int[nums.length];
    
            for (int i = 0; i < nums.length; i++) {
                result[i] = prefix;
                prefix *= nums[i];
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                result[i] *= suffix;
                suffix *= nums[i];
            }
            return result;
        }
    }
}

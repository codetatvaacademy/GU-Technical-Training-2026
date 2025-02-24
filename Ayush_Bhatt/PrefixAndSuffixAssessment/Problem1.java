package testDSA;

public class Problem1 {

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        
        for (int num : nums) {
            totalSum += num; 
        }

        
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i]; 
            if (leftSum == rightSum) { 
                return i; 
            }
            leftSum += nums[i]; 
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -1, 8, 4};
        int[] nums2 = {1, -1, 4};
        int[] nums3 = {2, 5};

        System.out.println(findMiddleIndex(nums1)); 
        System.out.println(findMiddleIndex(nums2)); 
        System.out.println(findMiddleIndex(nums3)); 
    }
}


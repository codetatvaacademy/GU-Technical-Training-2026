class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int end = k-1;
        int window = 0;

        int leftMax[] = new int[nums.length];
        int rightMax[] = new int[nums.length];
        int result[] = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(i % k == 0){
                max = nums[i];
                leftMax[i] = nums[i];
            }
            else{
                if(nums[i] > max){
                    max = nums[i];
                }
                leftMax[i] = max;
            }
        }

        for(int i = nums.length-1; i >=0 ; i--){
            if(i == nums.length-1 && i % k != k-1){
                rightMax[i] = nums[i];
                max = nums[i];
            }
            else if(i % k == k-1){
                max = nums[i];
                rightMax[i] = nums[i];
            }
            else{
                if(nums[i] > max){
                    max = nums[i];
                }
                rightMax[i] = max;
            }
        }

        while(start <= nums.length- k){
            result[start] = Math.max(leftMax[end], rightMax[start]);
            start++;
            end++;
        }

        return result;
    }
}

class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum=0;
        for(int num : nums){
            totalSum+=num;
        }
        if(x>totalSum){
            return -1;
        }
        if(x==totalSum){
            return nums.length;
        }
        int target=totalSum-x;
        int start=0;
        int end=0;
        int maxLength=Integer.MIN_VALUE;
        int sum=0;
        while(end<nums.length){
            sum+=nums[end];
            while(sum>target && start<=end){
                sum-=nums[start];
                start++;
            }
            if(sum==target){
                maxLength=Math.max(maxLength,end-start+1);
            }
            end++;
        }
        return maxLength==Integer.MIN_VALUE ? -1 : nums.length-maxLength;
    }
}
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start=0;
        int end=0;
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] freq=new int[max+1];
        int maxSum=0;
        while(end<nums.length){
            freq[nums[end]]++;
            sum+=nums[end];
            while(freq[nums[end]]>1){
                freq[nums[start]]--;
                sum-=nums[start];
                start++;
            }
            maxSum=Math.max(maxSum,sum);
            end++;
        }
        return maxSum;
    }
}

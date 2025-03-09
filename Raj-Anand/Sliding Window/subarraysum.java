class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int minlength=nums.length+1;
        int sum=0;
       while(end<nums.length){
         sum+=nums[end];
        while(sum>=target){
            minlength=Math.min(minlength,end-start+1);
            
           
            sum-=nums[start];
             start++;
            
        }
        end++;
        

       }
       return minlength==nums.length+1?0:minlength;

        
    }
}

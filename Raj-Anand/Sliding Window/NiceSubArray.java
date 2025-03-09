class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    private int atMostK(int[]nums,int k){
        
    
        int start=0;
        int end=0;
        int count=0;
        for(end=0;end<nums.length;end++){
            if(nums[end]%2!=0){
                k--;

            }
            while(k<0){
                if(nums[start]%2!=0){
                    k++;

                }
                start++;

            }
            count+=end-start+1;
        }
        return count;
        
    }
}
    
        
    

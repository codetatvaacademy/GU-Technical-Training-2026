class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int target=sum-x;
        if(target==0){
                return nums.length;
        }
        if(target<0){
            return -1;
        }
        int start=0;
        int end=0;
        int length=0;
    
        while(end<nums.length){
            target -=nums[end];

            while(target<0 && start<=end){
                target +=nums[start];
                start++;
                
            }
            if(target==0){
                length = Math.max(length,end-start+1);
            }
            end++;        
                    
        }
        if(length==0){
            return -1;
        }
        
        return nums.length-length;
                
            
        
        
        
    }
}

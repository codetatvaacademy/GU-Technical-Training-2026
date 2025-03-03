class Solution {
    public int minOperations(int[] nums, int x) {
        int start=0;
        int end=0;
        int length=-1;
        int target=0;
        for(int i =0;i<nums.length;i++){
            target+=nums[i];
        }
        target-=x;
        if(target<0){
            return -1;
        }
        while(end<nums.length){
            target-=nums[end];
            while(target<0 && start<=end){
                target+=nums[start];
                start++;
            }
            if(target==0 && length<end-start+1){
                length=end-start+1;
            }
            end++;
        }
        if(length!=-1){
            return nums.length-length;
        }
        else{
            return -1;
        }
    }
}

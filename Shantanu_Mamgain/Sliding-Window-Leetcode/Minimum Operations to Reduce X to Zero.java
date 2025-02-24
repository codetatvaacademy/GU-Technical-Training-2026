class Solution {
    public int minOperations(int[] nums, int x) {
        int start = 0;
        int end = 0;
        
        int maxLen = 0;
        int remaintarget = 0;
        int total = 0;

        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        remaintarget = total - x;

        if(total == x){
            return nums.length;
        }
        

        while(end < nums.length){
            remaintarget -= nums[end];

           
            while(remaintarget < 0 && start <= end){
                remaintarget += nums[start];
                start ++;
            }
            if(remaintarget == 0){
                maxLen = Math.max(maxLen, (end-start)+1);
            }
            end ++;
        }

        if(maxLen == 0){
            return -1;
        }
        else{
            return nums.length - maxLen;
        }
    }
}

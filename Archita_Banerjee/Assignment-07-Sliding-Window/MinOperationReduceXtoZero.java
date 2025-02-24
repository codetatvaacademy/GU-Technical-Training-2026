public class MinOperationReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        x= -x;
        for(int num:nums){
            x +=num;
        }
        if(x<0){
            return -1;
        }
        if(x==0){
            return nums.length;
        }
        int maxlen=-1;
        int start=0;
        int end=0;
        while(end<nums.length){
            x -= nums[end];
            while(x<0){
                x+=nums[start++];
            }
            if(x==0){
                maxlen= Math.max(maxlen,end-start+1);
            }
            end++;
        }
        return maxlen==-1?-1:nums.length-maxlen;
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        long fmax=Long.MIN_VALUE,smax=Long.MIN_VALUE,tmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(fmax<nums[i]){
                tmax=smax;
                smax=fmax;
                fmax=nums[i];
            }
            else if(fmax>nums[i] && nums[i]>smax){
                tmax=smax;
                smax=nums[i];
            }
            else if(smax>nums[i] && tmax<nums[i]){
                tmax=nums[i];
            }
            System.out.println(fmax+" "+smax+" "+tmax);
        }
        if(tmax== Long.MIN_VALUE){
            return (int)fmax;
        }
        else{
            return (int)tmax;
        }
        
    }
}
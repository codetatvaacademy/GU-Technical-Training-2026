public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start=0;
        int end=k-1;
        int leftmax[]= new int [nums.length];
        int rightmax[]= new int [nums.length];
        while(start <nums.length){
            if(end>=nums.length){
                end=nums.length-1;
            }
            leftmax[start]= nums[start];
            for(int i=start+1;i<=end;i++){
                leftmax[i] =Math.max(nums[i] ,leftmax[i-1]);
            }
            rightmax[end]= nums[end];
            for(int i=end-1;i>=start;i--){
                rightmax[i] = Math.max(nums[i], rightmax[i+1]);
            }
            start = start + k;
            end = start + k - 1;

        }
        int [] maxS= new int[nums.length-k+1];
        start=0;
        end=k-1;
        while(end< nums.length){
            maxS[start]= Math.max(leftmax[end], rightmax[start]);
            start++;
            end++;
        }
        return maxS;
    }
}

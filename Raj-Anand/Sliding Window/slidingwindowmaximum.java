class Solution {
    public int[] maxSlidingWindow(int[] nums, int K) {
        int[] leftmax=new int[nums.length];
        int[] rightmax=new int[nums.length];
        int[] answer=new int[nums.length-K+1];
        for(int start=0;start<nums.length;start+=K){
           int end=Math.min(start+K-1,nums.length-1);
            for(int i=start,max=Integer.MIN_VALUE;i<=end;i++){
                max=Math.max(max,nums[i]);
                leftmax[i]=max;

            }
        
         for(int i=end,max=Integer.MIN_VALUE;i>=start;i--){
                max=Math.max(max,nums[i]);
                rightmax[i]=max;
         }
        }
        
         for(int i=0;i<=nums.length-K;i++){
         answer[i]=Math.max(rightmax[i],leftmax[i+K-1]);
    
        }
     return answer;

    }
   
}


















        

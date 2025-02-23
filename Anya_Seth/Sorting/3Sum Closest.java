class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int ans=0;
      int minDiff=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        if(i>0&&nums[i]==nums[i-1]) continue;
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            int diff=Math.abs(target-sum);
            if(sum>=target){
                k--;
            }
            else if(sum<target){
                j++;
            }
           if(diff<minDiff){
            minDiff=diff;
            ans=sum;
           }
        }
      }
      return ans;
    }
}

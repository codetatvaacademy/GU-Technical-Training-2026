class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j= 1;
        int k = nums.length-1;
        int minSum = 3001;
        int minDiff = Integer.MAX_VALUE;
        while(i<nums.length-2){
            k = nums.length-1;
            j=i+1;
            while(j<k){
                int currentSum = nums[i]+nums[j]+nums[k];
                if(target-currentSum>0){
                    j++;
                }
                else if(currentSum-target==0){
                    return currentSum;
                }
                else{
                    k--;
                }
                if(minDiff>Math.abs(target-currentSum)){
                    minDiff = Math.abs(target-currentSum);
                    minSum = currentSum;
                }
            }
            i++;
        }
        return minSum;
    }
}
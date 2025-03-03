class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length - 1] - nums[0]; 

        while (start <= end) {
            int mid = start +(end - start) / 2;
            if (countPairsWithDifference(nums,mid) >= p){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

private int  countPairsWithDifference(int[] nums , int mid){
    int pairCount = 0;
    for(int i = 0; i< nums.length - 1; i++){
        if(nums[i+1] - nums[i] <= mid){
            pairCount++;
            i++;
            
        }
    }
    return pairCount;
    }
}


        

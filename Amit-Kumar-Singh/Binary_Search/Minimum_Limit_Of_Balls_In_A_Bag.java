//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int maxSize = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(maxSize<nums[i]){
                maxSize = nums[i];
            }
        }

        int result = 0;
        while(start<=maxSize){
            int mid = (start+maxSize)/2;
            int opCounter = 0;

            for(int i = 0;i<nums.length;i++){
                opCounter += (nums[i]-1)/mid;
            }

            if(opCounter<=maxOperations){
                result = mid;
                maxSize = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
}

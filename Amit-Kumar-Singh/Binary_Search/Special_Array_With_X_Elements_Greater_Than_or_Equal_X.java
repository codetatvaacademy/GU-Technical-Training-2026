//Time Complexity: O(nlogn)
//Space Complexity: O(1)
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=1;i<=nums.length;i++){
            int start =0;
            int end = nums.length-1;
            int index = end+1;

            while(start<=end){
                int mid = (end+start)/2;
                if(nums[mid] >= i){
                    index = mid;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            if(nums.length-index == i){
                return i;
            }
        }
        return -1;
    }
}
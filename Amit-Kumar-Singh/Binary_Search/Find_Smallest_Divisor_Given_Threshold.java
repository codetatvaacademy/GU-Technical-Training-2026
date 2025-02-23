//Time Complexity: O(n)
//Space Compelxity: O(1)
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i:nums){
            max = max<i?i:max;
        }
        int start = 1;
        int result=0;
        while(start<=max){
            int mid = (start+max)/2;
            int sum = 0;
            for(int i = 0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum>threshold){
                start = mid+1;
            }
            else if(sum<=threshold){
                result = mid;
                max = mid-1;
            }
        }
        return result;
    }
}
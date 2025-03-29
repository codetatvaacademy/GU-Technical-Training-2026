class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int s = 0, e = 0;
        int product = 1;
        int ans = 0;

        while(e < nums.length){
            product *= nums[e];
            while( s <= e && product >= k){
                product /= nums[s];
                s++;
            }
            ans += e - s + 1;
            e++;

        }
        return ans;
    }
}

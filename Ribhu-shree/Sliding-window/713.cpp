class Solution {
    public:
        int numSubarrayProductLessThanK(vector<int>& nums, int k) {
            int count = 0, n = nums.size();
            long product = 1, left = 0, right = 0;
            if(k <=1){
                return 0;
            }
            while (right < n) {
                product = product * nums[right];
                
                while (product >= k ) {
                    product = product / nums[left];
                    left++;
                }
                
                count += (right-left + 1);
                right++;
            }
            return count;
        }
    };
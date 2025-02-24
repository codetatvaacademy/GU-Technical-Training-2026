class Solution {
    public:
        int longestOnes(vector<int>& nums, int k) {
            int left=0,right=0, zerocount=0,max_window=0;
            int n = nums.size();
            while(right<n){
                if(nums[right]==0) zerocount++;
                if(zerocount > k ){
                    while(zerocount>k){
                        if(nums[left]== 0){
                           zerocount--; 
                        }
                        left++;
                    }
                }
                
                max_window=max(max_window,right-left+1);
                right++;
            }
            return max_window;
        }
    };
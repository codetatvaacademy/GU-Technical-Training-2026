class Solution {
    public:
        void nextPermutation(vector<int>& nums) {
            int i = nums.size()-2;
            while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            }
            int j=nums.size()-1;
            if(i>=0){
    
                while(j>i &&  nums[j] <= nums[i]){
                    j--;
                }
                swap(nums[i],nums[j]);
            }
            
    
            reverse(nums.begin()+i+1,nums.end());
        }
    };
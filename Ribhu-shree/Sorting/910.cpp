class Solution {
    public:
        int smallestRangeII(vector<int>& nums, int k) {
            int n = nums.size();
            if (n == 1) return 0;
            sort(nums.begin(),nums.end());
            int result=nums[n-1]-nums[0];
            for(int i =0 ;i<n-1;i++){
                int maxi= max(nums[n-1]-k,nums[i]+k);
                int mini = min(nums[0]+k,nums[i+1]-k);
               result = min (result,maxi-mini);
            }
    
    
            return result;
        }
    };
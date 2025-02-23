class Solution {
    public:
        int numberOfSubarrays(vector<int>& nums, int k) {
            int start=0;
            int count=0;
            int odd=0;
    
            for(int i=0;i<nums.size();i++){
                if(nums[i]==1){
                    odd++;
                }
    
                while(odd>k){
                    odd--;
                    start++;
                }
                if(odd==k){
                    count++;
                }
            }
            return count;
        }
    };
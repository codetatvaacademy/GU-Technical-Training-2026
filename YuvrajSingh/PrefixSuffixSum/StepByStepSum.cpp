class Solution {
    public:
        int minStartValue(vector<int>& nums) {
            int n = nums.size();
            int sum =0;
            int mini =INT_MAX;
            for(int i =0;i<n;i++){
                sum += nums[i];
                mini =min(mini,sum);
            }
            return mini>=0 ?1:abs(mini)+1;
        }
    };
class Solution {
    public:
        int minStartValue(vector<int>& nums) {
            int sum=0;
            int minValue=0;
            for(int i=0;i<nums.size();i++){
                sum+=nums[i];
                minValue=min(minValue,sum);
    
            }
            return 1-minValue;
            
        }
    };
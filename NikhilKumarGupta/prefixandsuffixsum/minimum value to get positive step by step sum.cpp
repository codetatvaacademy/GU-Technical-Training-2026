class Solution {
    public:
        int minStartValue(vector<int>& nums) {
            int n=nums.size();
            int sum=0;
            int minsum=0;
    
    
            for(int i=0;i<n;i++){
                sum+=nums[i];
                minsum=min(sum,minsum);
    
            }
            return abs(minsum)+1;
        }
    };
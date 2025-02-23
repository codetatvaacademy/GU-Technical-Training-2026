class Solution {
    public:
        int minSubArrayLen(int target, vector<int>& nums) {
            int start=0;
            int end=0;
            int minL=nums.size()+1;
            int sum=0;
            for(end=0;end<nums.size();end++){
               sum+=nums[end];
               while(sum>=target){
                minL=min(minL,end-start+1);
                sum-=nums[start];
                start++;
               }
                 
            }
            return minL == nums.size() + 1 ? 0 : minL;
        }
    };
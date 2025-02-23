class Solution {
    private: int helper(vector<int> & nums,int goal){
        if(goal<0) return 0;
        int start=0;
        int end=0;
        int count=0;
        int n=nums.size();
        int sum=0;
        while(end<n){
            sum+=nums[end];
            while(sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=end-start+1;
            end++;

        }
        return count; 
    }
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
};

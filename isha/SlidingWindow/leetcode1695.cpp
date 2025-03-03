class Solution {
    public:
        int maximumUniqueSubarray(vector<int>& nums) {
            int start=0;
            int sum=0;
            int maxSum=0;
            vector<int> freq(10001,0);
            for(int end=0;end<nums.size();end++){
                freq[nums[end]]++;
                sum+=nums[end];
                while(freq[nums[end]]>1){
                    freq[nums[start]]--;
                    
                    sum-=nums[start];
                    start++;
                }
                maxSum=max(sum,maxSum);
            }
            return maxSum;
        }
    };
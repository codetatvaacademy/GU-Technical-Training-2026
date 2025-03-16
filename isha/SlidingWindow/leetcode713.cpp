class Solution {
    public:
        int numSubarrayProductLessThanK(vector<int>& nums, int k) {
            int start=0;
            int end=0;
            int product=1;
            int count=0;
            while(end<nums.size()){
                product*=nums[end];
                while(product >=k && start<=end){
                    product/=nums[start];
                    start++;
                    
                }
                count+=end-start+1;
                end++;
                
            }
            return count;
        }
    };
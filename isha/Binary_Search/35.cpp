class Solution {
    public:
        int searchInsert(vector<int>& nums, int target) {
           int n=nums.size();
            int low=0;
            int high=n-1;
            int mid;
            while(low<=high){
                mid=(low+high)/2;
                if(target==nums[mid]){
                    return mid;
                }
                if(target>nums[mid]){
                    low=mid+1;
    
                }
                else{
                    high=mid-1;
                }
            }
            return low;
            
        }
    };
class Solution {
    public:
        int findMin(vector<int>& nums) {
            int high=nums.size()-1;
            int low=0;
            while(low<high){
                int mid=(high+low)/2;
                if(nums[mid]>nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
                
            }
            return nums[low];
            
        }
    };
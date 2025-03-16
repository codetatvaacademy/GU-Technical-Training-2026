class Solution {
    public:
        int findPeakElement(vector<int>& nums) {
            int start=0;
            int end=nums.size()-1;
            while(start<end){
                int mid=(end+start)/2;
                if(nums[mid]>nums[mid+1]){
                    end=mid;
                }
                else{
                    start=mid+1;
    
                }
            }
    return start;
            
            
        }
    };
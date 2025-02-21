class Solution {
    public:
        int xElement(vector<int>& nums,int x){
            int count = 0;
            for(int i =0; i<nums.size(); i++){
                if(nums[i]>=x)
                count++;
            }
            return count;
        }
        int specialArray(vector<int>& nums) {
            int low = 0;
            int high = nums.size();
            
            while(low<=high)
            {
                int mid = (low+high)/2;
                int count = xElement(nums,mid);
                if(mid == count)
                {
                return mid;
                }
                else if(mid<count)
                {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return -1;
        }
    };
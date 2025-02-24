class Solution {
    public:
        int numberOfSubarrays(vector<int>& nums, int k) {
            int count=0,sub_count=0,even=0,left=0;
            for(int right = 0;right<nums.size();right++){
                even=0;
                if(nums[right] %2 ==1){
                    count++;
                   
                }
                while(count > k){
                    if(nums[left]%2==1){
                        count--;
                    }
                    left++;
                }
                if(count==k){
                    int temp_left=left;
                    while (temp_left <= right && nums[temp_left] % 2 == 0) {
                        even++;
                        temp_left++;
                    }
                sub_count += (even+1);
                }
    
            }
            return sub_count;
        }
    };
class Solution {
    public:
        int threeSumClosest(vector<int>& nums, int target) {
            sort(nums.begin(),nums.end());
            if(nums.size()<3){
                return 0;
            }
            int min_diff_sum = nums[0] + nums[1] + nums[2];
            for(int i =0;i<nums.size();i++){
                int l =i+1,h=nums.size()-1;
                while(l<h){
                    int currsum = nums[i]+nums[l]+nums[h];
                    if(abs(currsum-target) < abs(min_diff_sum-target)){
                        min_diff_sum = currsum;
                    }
                    if(currsum<target){
                        l++;
                    }else if(currsum>target){
                        h--;
                    }else{
                        return currsum;
                    }
    
                }
    
            }
            return min_diff_sum;
        }
    };
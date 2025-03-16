class Solution {
    public:
        vector<vector<int>> threeSum(vector<int>& nums) {
            vector<vector<int>> result;
            sort(nums.begin(),nums.end());
            int target =0;
    
            for(int i =0;i<nums.size();i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                int l = i +1;
                int h = nums.size()-1;
                while(l<h){
                    int currsum=nums[i]+nums[l]+nums[h];
                    if(currsum == target){
                        result.push_back({nums[i],nums[l],nums[h]});
    
                        while(l<h && nums[l]==nums[l+1]){
                            l++;
                        }
                        while(l<h && nums[h]==nums[h-1]){
                            h--;
                        }
                        l++;
                        h--;
                    }else if (currsum < target){
                        l++;
                    }else{
                        h--;
                    }
                }
            }
            return result;
        }
    };
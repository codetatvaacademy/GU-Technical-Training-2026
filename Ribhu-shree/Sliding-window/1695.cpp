class Solution {
    public:
        int maximumUniqueSubarray(vector<int>& nums) {
            unordered_map<int, int> map;
            int l = 0, r = 0, n = nums.size();
            int max_sum=0,sum=0;
            while (r < n) {
                if(map.find(nums[r]) != map.end() && map[nums[r]]>=l){
                  while(l < map[nums[r]]+1){
                    sum -= nums[l];
                    l++;
                  }
                   
                }
                map[nums[r]]=r;
                sum += nums[r];
                max_sum = max(max_sum,sum);
                r++;
            }
            return max_sum;
        }
    };
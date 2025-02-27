class Solution {
    public:
    
        int tellFunction(int val , vector<int> &nums, int thres){
            int count = 0;
            for(int i=0;i<nums.size();i++){
                count+= (nums[i] + val - 1) / double(val);
                if(count>thres) return count;
            }
            return count;
        }
        int smallestDivisor(vector<int>& nums, int thres) {
            int min  = 1;
            int max = INT_MIN;
    
            //Find the starting and ending point
    
            for(auto x: nums){
                if(x>max) max = x;
            }
            int ans = -1;
            while(min<=max){
                int mid = (max + min)/2;
    
                int val = tellFunction(mid, nums,thres);
                if(val <= thres){
                    ans = mid;
                    max = mid - 1;
                }
                else{
                    min = mid + 1;
                }
            
            }
    
            return ans;
    
    
        }
    };
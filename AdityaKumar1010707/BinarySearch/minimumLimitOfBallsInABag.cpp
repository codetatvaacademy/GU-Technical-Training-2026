class Solution {
    public:
        int checkVal(int value, vector<int> nums) {
            int count = 0;
            for (int i = 0; i < nums.size(); i++) {
                count += (--nums[i] / value);
            }
            cout<<count<<" for num : " << value <<endl;
            return count;
        }
    
        int minimumSize(vector<int>& nums, int maxOperations) {
            int min = 1;
            int max = 1e9;
          
            while (min < max) {
    
                int mid = min + (max - min) / 2;
                int val = checkVal(mid, nums);
    
                if (val > maxOperations) {
                    // Go right
                    min = mid + 1;
                } else {
                    // Go right
                    
                    max = mid;
                }
            }
    
            return min;
        }
    };
class Solution {
    public:
        int minSwaps(vector<int>& nums) {
            int minswap = 0, winsize = 0, zero = 0, n = nums.size();
    
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] == 1)
                    winsize++;
            }
    
            if (winsize == 0 || winsize == n)
                return 0;
    
            for (int i = 0; i < winsize; i++) {
                if (nums[i] == 0)
                    zero++;
            }
    
            minswap = zero;
    
            for (int i = 1; i < nums.size(); i++) {
                if (nums[i - 1] == 0)
                    zero--;
                if (nums[(i + winsize - 1) % n] == 0)
                    zero++;
                minswap = min(minswap, zero);
            }
    
            return minswap;
        }
    };
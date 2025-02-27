class Solution {
    public:
        int isValid(int day, vector<int>& bloomDay, int bundles, int flowers) {
    
            int bund = bundles;
            int flo = flowers;
    
            for (int i = 0; i < bloomDay.size(); i++) {
                if (bloomDay[i] <= day) {
                    flo--;
                } else {
                    flo = flowers;
                }
                if (flo == 0) {
                    bund--;
                    flo = flowers;
                }
                if (bund <= 0) {
                    return 0;
                }
            }
    
            return bund;
        }
        int minDays(vector<int>& bloomDay, int m, int k) {
            long long  size = bloomDay.size();
            long long totalFlowers = (long long )m*k;
            if(totalFlowers > size) return -1;
    
            int min = INT_MAX;
            int max = INT_MIN;
    
            for (int x : bloomDay) {
                if (x < min)
                    min = x;
                if (x > max)
                    max = x;
            }
    
            int ans = -1;
    
            while (min <= max) {
                int mid = (min + max) / 2;
                // If yes then go left
                if (isValid(mid, bloomDay, m, k) <= 0) {
    
                    max = mid - 1;
                    ans = mid;
                } else {
    
                    min = mid + 1;
                }
            }
    
            return ans;
        }
    };
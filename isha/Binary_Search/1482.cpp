class Solution {
    private:
        int isBloom(vector<int>& bloomDay, int mid, int k) {
            int count = 0;   
            int totalB = 0;  
            for (int i = 0; i < bloomDay.size(); i++) {
                if (bloomDay[i] <= mid) {
                    count++; 
                    if (count == k) {
                        totalB++; 
                        count = 0; 
                    }
                } else {
                    count = 0; 
                }
            }
            return totalB;
        }
    
    public:
        int minDays(vector<int>& bloomDay, int m, int k) {
            int start = *min_element(bloomDay.begin(), bloomDay.end());
            int end = *max_element(bloomDay.begin(), bloomDay.end());
            int mid;
            int minDay = -1;
           long long totalFlowers = (long long)m * k; 
            if (totalFlowers > bloomDay.size())
                return -1;
            while (start <= end) {
                mid = (start + end) / 2;
                if (isBloom(bloomDay, mid, k) >= m) {
    
                    minDay = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return minDay;
        }
    };
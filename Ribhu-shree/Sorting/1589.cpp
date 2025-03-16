class Solution {
    public:
        int maxSumRangeQuery(vector<int>& nums, vector<vector<int>>& requests) {
            int n = nums.size();
            vector<int> freq(n, 0);
            for (int i = 0; i < requests.size(); i++) {
                freq[requests[i][0]]++;
                if (requests[i][1] + 1 < freq.size()) {  
                    freq[requests[i][1] + 1]--;
                }
            }
            for (int i = 1; i < freq.size(); i++) {
                freq[i] += freq[i - 1];
            }
            sort(freq.begin(), freq.end());
            sort(nums.begin(), nums.end());
            long long total_sum = 0;
            const int MOD = 1000000007;
            for (int i = 0; i < nums.size(); i++) {
                total_sum = (total_sum + (long long)nums[i] * freq[i]) % MOD;
            }
            return (int)total_sum;
        }
    };
    
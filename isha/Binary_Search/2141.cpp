class Solution {
    public:
        long long maxRunTime(int n, vector<int>& batteries) {
            long long start = *min_element(batteries.begin(), batteries.end());
            long long mid;
            long long end = 0;
            for (long long battery : batteries) {
                end += battery;
            }
            end/=n;
            while (start <= end) {
                mid = (start + end) / 2;
                long long sum = 0;
                for (long long battery : batteries) {
                    sum += min(battery, mid);
                }
                if (sum >= n * mid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return end;
        }
    };
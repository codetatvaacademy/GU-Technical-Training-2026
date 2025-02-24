class Solution {
    public:
        int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
            int max_not_s = INT_MIN, not_s = 0, s = 0, n = customers.size();
            int k = 0; // k wil store the starting index of the window consisting of maximum customer
            if (n == 1)  return customers[0];
    
            for (int i = 0; i < n; i++) {
                if (grumpy[i] == 0)
                    s = s + customers[i];
            }
    
            for (int i = 0; i < minutes; i++) {
                if (grumpy[i] == 1) {
                    not_s += customers[i];
                }
            }
            max_not_s = not_s;
    
            for (int i = 1; i <= n - minutes; i++) {
                if (grumpy[i - 1] == 1) {
                    not_s -= customers[i - 1];
                }
                if (grumpy[i + minutes - 1] == 1) {
                    not_s += customers[i + minutes - 1];
                }
    
                max_not_s = max(max_not_s, not_s);
            }
            return max_not_s + s;
            ;
        }
    };
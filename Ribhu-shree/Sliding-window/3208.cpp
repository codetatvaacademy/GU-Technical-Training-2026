class Solution {
    public:
        int numberOfAlternatingGroups(vector<int>& colors, int k) {
            int n = colors.size();
            int end = 1;
            int count = 0;
            int window = 1;
            while (end < n + k - 1) {
                if (colors[end % n] != colors[(end - 1) % n]) {
                    window++;
                    if (window >= k) {
                        count++;
                    }
                } else {
                    window = 1;
                }
                end++;
            }
            return count;
        }
    
    }
    ;
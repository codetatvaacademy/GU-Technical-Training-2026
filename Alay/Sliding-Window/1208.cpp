class Solution {
    public:
        int equalSubstring(string s, string t, int maxCost) {
            int start = 0, end = 0, maxLen = 0, cost = 0;
            while(end < s.size()){
                cost += abs(s[end] - t[end]);
                while(cost > maxCost){
                    cost -= abs(s[start] - t[start]);
                    start++;
                }
                maxLen = max(maxLen, end - start + 1);
                end++;
            }
            return maxLen;
        }
};
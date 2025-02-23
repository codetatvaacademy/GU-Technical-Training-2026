class Solution {
public:
    vector<int> diStringMatch(string s) {
        int n = s.length();
        vector<int> result(n + 1);
        int low = 0, high = n;
        for (int i = 0; i < n; ++i) {
            if (s[i] == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;
        return result;
    }
};
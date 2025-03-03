class Solution {
public:
    int maxScore(string s) {
        int zeroes = 0;
        int ones = 0;
        int l = s.length();

        for (char c : s) {
            if (c == '0') zeroes++;
        }

        vector<int> arr(l, 0);

        for (int i = l - 1; i >= 1; i--) {
            if (s[i] == '1') {
                ones++;
            } else {
                zeroes--;
            }
            arr[i] = zeroes + ones;
        }

        int maxVal = INT_MIN;
        for (int x : arr) {
            if (x > maxVal) maxVal = x;
        }

        return maxVal;
    }
};

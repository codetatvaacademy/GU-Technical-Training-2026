class Solution {
public:
    string minWindow(string s, string t) {
        if (s.empty() || t.empty() || s.size() < t.size()) {
            return "";
        }

        int charCount[256] = {0};
        for (char c : t) {
            charCount[c]++;
        }

        int left = 0, right = 0;
        int count = t.size();
        int minLen = INT_MAX;
        int startIndex = 0;

        while (right < s.size()) {
            char rChar = s[right];
            if (charCount[rChar] > 0) {
                count--;
            }
            charCount[rChar]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char lChar = s[left];
                if (charCount[lChar] >= 0) {
                    count++;
                }
                charCount[lChar]++;
                left++;
            }
        }

        return minLen == INT_MAX ? "" : s.substr(startIndex, minLen);
    }
};
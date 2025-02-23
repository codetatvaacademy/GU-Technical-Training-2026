class Solution {
public:
    string reverseWords(string s) {
        int start = 0, end = 0;
        while (end < s.length()) {
            while (end < s.length() && s[end] != ' ') {
                end++;
            }
            reverse(s.begin() + start, s.begin() + end);
            start = ++end;
        }
        return s;
    }
};
class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if (s1.length() > s2.length()) {
            return false; 
        }
        vector<int> s1_count(26, 0);
        vector<int> s2_count(26, 0);
        for (char c : s1) {
            s1_count[c - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            s2_count[s2[i] - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (s1_count == s2_count) {
                return true; 
            }
            s2_count[s2[i] - 'a']--;
            s2_count[s2[i + s1.length()] - 'a']++;
        }
        return s1_count == s2_count;
    }
};
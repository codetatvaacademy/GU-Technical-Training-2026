class Solution {
    public:
        bool checkInclusion(string s1, string s2) {
            int n = s1.length();
            int m = s2.length();
            if (n > m)
                return false;
            vector<int> freq_s1(26, 0), freq_s2(26, 0);
    
            for (int i = 0; i < n; i++) {
                freq_s1[s1[i] - 'a']++;
                freq_s2[s2[i] - 'a']++;
            }
            if (freq_s1 == freq_s2)
                return true;
    
            for (int i = 1; i <= m - n; i++) {
                freq_s2[s2[i - 1] - 'a']--;
                freq_s2[s2[i + n - 1] - 'a']++;
    
                if (freq_s1 == freq_s2)
                    return true;
            }
    
            return false;
        }
    };
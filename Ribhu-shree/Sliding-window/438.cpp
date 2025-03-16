class Solution {
    public:
        vector<int> findAnagrams(string s, string p) {
            vector<int> answer;
            int n = p.length();
            int m = s.length();
            if (m < n)
                return answer;
            vector<int> freq_p(26, 0), freq_s(26, 0);
            for (int i = 0; i < n; i++) {
                freq_p[p[i] - 'a']++;
            }
            // first window
    
            for (int i = 0; i < n; i++) {
                freq_s[s[i] - 'a']++;
            }
            if (freq_s == freq_p) {
                answer.push_back(0);
            }
    
            for (int i = 1; i <= m - n; i++) {
                freq_s[s[i - 1] - 'a']--;
                freq_s[s[i + n - 1] - 'a']++;
                if (freq_s == freq_p)
                    answer.push_back(i);
            }
    
            return answer;
        }
    };
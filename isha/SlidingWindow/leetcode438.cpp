class Solution {
    public:
        vector<int> findAnagrams(string s, string p) {
            int m = s.length();
            int n = p.length();
          
            vector<int> result;
              if (m < n) return result; //if s is smaller than p return empty index
            vector<int> freqP(26, 0);
            vector <int>windowFreq(26, 0);
            int end = 0;
            int start = 0;
            for (char c : p) {
                freqP[c-'a']++;
            }
           for (int end = 0; end < m; ++end) {
                windowFreq[s[end]-'a']++;
                if (end - start + 1 > n) {
                    windowFreq[s[start]-'a']--;
                    start++;
                }
                if (end - start + 1 == n && windowFreq == freqP) {
                    result.push_back(start);
                }
                
            }
            return result;
        }
    };
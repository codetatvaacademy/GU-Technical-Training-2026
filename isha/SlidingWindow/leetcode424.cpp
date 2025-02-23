class Solution {
    public:
        int characterReplacement(string s, int k) {
             int start = 0, end = 0, maxFreq = 0, maxL = 0;
             vector<int> freq(26,0);
    
            while (end < s.length()) {
                freq[s[end] - 'A']++;
                maxFreq = max(maxFreq, freq[s[end] - 'A']);
                if (end - start + 1 - maxFreq > k) {
                    freq[s[start] - 'A']--;
                    start++;
                }
                maxL = max(maxL, end - start + 1);
                end++;
            }
    
            return maxL;
            
        }
    };
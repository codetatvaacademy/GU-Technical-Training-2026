class Solution {
    public:
        int numberOfSubstrings(string s) {
            int start = 0;
            int end = 0;
            int totalS = 0;
            unordered_map<char, int> map;
            while (end < s.length()) {
                map[s[end]]++;
                while(map['a'] > 0 && map['b'] > 0 && map['c'] > 0) {
    
                    map[s[start]]--;
                    start++;
                    totalS += s.size() - end;
                }
                end++;
            }
            return totalS;
        }
    };
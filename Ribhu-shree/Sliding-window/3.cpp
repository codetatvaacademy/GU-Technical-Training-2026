class Solution {
    public:
        int lengthOfLongestSubstring(string s) {
            unordered_map<char,int> map;
    
            int l=0,r=0;
            int max_length = 0;
            while(r<s.size()){
                if(map.find(s[r]) != map.end() && map[s[r]]>=l){
                    l= map[s[r]]+1;
                }
                map[s[r]] = r;
    
                max_length = max(max_length, r - l + 1);
                r++;
            }
    
            return max_length;
        }
    };
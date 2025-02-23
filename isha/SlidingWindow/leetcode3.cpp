class Solution {
    public:
        int lengthOfLongestSubstring(string s) {
            int start=0;
            int end=0;
            vector<int> freq(128,0);
            int maxi=0;
            while(end<s.length()){
                char currentC=s[end];
                freq[currentC]++;
                while(freq[currentC]>1){
                    freq[s[start]]--;
                    start++;
                }
                maxi=max(maxi,end-start+1);
                end++;
            }
            return maxi;
        }
    };
class Solution {
    public:
        int lengthOfLongestSubstring(string s) {
            
            vector<int>mpp(256,-1);
            int l=0;
            int r=0;
            int maxlen=0;
            int n=s.size();
    
            while(r<n){
                if(mpp[s[r]]!=-1){
                    if(mpp[s[r]]>=l){
                        l=mpp[s[r]]+1;
                    }
                }
                int len=r-l+1;
                maxlen=max(maxlen,len);
                mpp[s[r]]=r;
                r++;
            }
            return maxlen;
    
        }
    };
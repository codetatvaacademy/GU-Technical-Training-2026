class Solution {
    public:
        string minWindow(string s, string t) {
            vector<int>tfreq(128,0);
            vector<int>window(128,0);
            int left=0;
            int right=0;
            int start=0;
            int match=0;
            int mini=INT_MAX;
    
            for(int i=0;i<t.size();i++){
                tfreq[t[i]]++;
            }
            for(int i=0;i<s.size();i++){
                window[s[right]]++;
    
                if(tfreq[s[right]]>0&&window[s[right]]<=tfreq[s[right]]){
                    match++;
                }
                while(match==t.size()){
                    if(mini>right-left+1){
                        mini=right-left+1;
                        start=left;
                    }
                    if(tfreq[s[left]]>0&&window[s[left]]==tfreq[s[left]]){
                    match--;
                }
                 window[s[left]]--;
                left++;
                }
                right++;
             
               
            }
            return mini==INT_MAX ?"":s.substr(start,mini);
            
        }
    };
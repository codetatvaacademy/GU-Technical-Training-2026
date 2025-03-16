class Solution {
    public:
        vector<int> findAnagrams(string s, string p) {
            vector<int>window(26,0),pfreq(26,0);
            int start=0;
            vector<int>ans;
            if(p.size()>s.size())return ans;
            
    
            for(int i=0;i<p.size();i++){
                window[s[i]-'a']++;
                pfreq[p[i]-'a']++;
    
            }
            if(window==pfreq){
                ans.push_back(start);
            }
            for(int i=p.size();i<s.size();i++){
                window[s[i]-'a']++;
                window[s[i-p.size()]-'a']--;
    
                 if(window==pfreq){
                ans.push_back(i-p.size()+1);
            }
                
            }
            return ans;
    
    
            
            
        }
    };
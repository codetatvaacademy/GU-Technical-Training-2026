class Solution {
    public:
        bool checkInclusion(string s1, string s2) {
            vector<int>s1freq(26,0),s2freq(26,0);
            if(s1.size()>s2.size())return false;
           
            for(int i=0;i<s1.size();i++){
                s1freq[s1[i]-'a']++;
                s2freq[s2[i]-'a']++;
            }
            if(s1freq==s2freq)return true;
            for(int i=s1.size();i<s2.size();i++){
                s2freq[s2[i]-'a']++;
                s2freq[s2[i-s1.size()]-'a']--;
                 if(s1freq==s2freq)return true;
    
            }
            return false;
            
    
            
        }
    };
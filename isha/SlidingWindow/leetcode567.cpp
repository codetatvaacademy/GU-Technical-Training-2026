class Solution {
    public:
        bool checkInclusion(string s1, string s2) {
            int m=s1.length();
            int n=s2.length();
            vector<int> freqS1(26,0);
            vector<int> windowFreq(26,0);
            for(char c: s1){
                freqS1[c-'a']++;
            }
            int start=0;
            for(int end=0;end<n;end++){
                windowFreq[s2[end]-'a']++;
                if(end-start+1>m){
                   
                    windowFreq[s2[start]-'a']--;
                    start++;
                    
                    
    
                }
                if(windowFreq==freqS1){
                    return true;
                }
                
            }
            return false;
        }
    };
class Solution {
    public:
        string minWindow(string s, string t) {
            int start=0;
            int end=0;
            int unique=0;
            int startIndex=-1;
            int endIndex=-1;
            int freqT[128]={0};
            int freqS[128]={0};
            int minLength=s.length()+1;
            for(char c: t){
                if(freqT[c]==0){
                    ++unique;
                }
                freqT[c]++;
            }
            while(end<s.length()){
                char c=s[end];
                ++freqS[c];
                if(freqS[c]==freqT[c]){
                    --unique;
                }
                while(unique==0){
                    if(end-start+1<minLength){
                        startIndex=start;
                        minLength=end-start+1;
                    }
                    char ch=s[start];
                    if(freqS[ch]==freqT[ch]){
                        ++unique;
                    }
                    ++start;
                    --freqS[ch];
                }
               ++end; 
               
        }
        return startIndex==-1 ? "": s.substr(startIndex,minLength);
        }
    };
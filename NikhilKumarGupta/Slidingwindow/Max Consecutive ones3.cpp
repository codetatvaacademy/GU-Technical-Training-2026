class Solution {
    public:
    bool vowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
        int maxVowels(string s, int k) {
            int n=s.size();
            int start=0;
            int maxcount=0;
            int count =0;
    
            for(int end=0;end<n;end++){
                if(vowel(s[end])){
                    count++;
                   
                }
                if(end>=k-1){
                    maxcount=max(count,maxcount);
                
                if(vowel(s[start])){
                    count--;
                }
                start++;
                
    
            }
            }
            return maxcount;
            
          
            
        }
    };
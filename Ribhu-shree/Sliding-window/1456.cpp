class Solution {
    public:
        bool vowel(char c){
            if(c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u') return true;
            return false;
        }
        int maxVowels(string s, int k) {
            int n = s.size(),vowelcount=0;
    
            int max_vowel=0;
            for(int i = 0 ;i <k;i++){
                if(vowel(s[i])) vowelcount++;
            }
            max_vowel = vowelcount;
            for(int i = 1;i<=n-k;i++){
                if(vowel(s[i-1])){
                    vowelcount--;
                }
                if(vowel(s[i+k-1])){
                    vowelcount++;
                }
                 max_vowel = max(vowelcount,max_vowel);
            }
          return  max_vowel;
        }
    };
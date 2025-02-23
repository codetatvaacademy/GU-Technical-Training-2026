class Solution {
    private: bool isVowel(char c){
        if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
public:
    int maxVowels(string s, int k) {
        int start=0;
        int end=0;
        int Vowels=0;
        int maxV=0;
        while(end<s.length()){
            if(isVowel(s[end])){
                Vowels++;
            }
            while(end-start+1>k){
                if(isVowel(s[start])){
                    Vowels--;
                }
                start++;


            }
            maxV=max(maxV,Vowels);
            end++;
        }
        return maxV;
    }
};
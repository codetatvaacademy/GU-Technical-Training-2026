class Solution {
public:
    bool isvow(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    string reverseVowels(string s) {
        int n=s.size();
        int i=0,j=n-1;
        while(i<j){
            if(isvow(s[i]) && isvow(s[j])){
                swap(s[i],s[j]);
                i++;
                j--;
                continue;
            }
            if(isvow(s[i]) && !isvow(s[j])){
                j--;
                continue;
            }
            if(!isvow(s[i]) && isvow(s[j])){
                i++;
                continue;
            }          
            i++;
            j--;       
        }
        return s;
    }
};

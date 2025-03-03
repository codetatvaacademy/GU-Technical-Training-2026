class Solution {
public:
    string reverseWords(string s) {
        int i=0,j=0,n=s.size();
        while(j<n){
            if(s[j]==' '){
                reverse(s.begin()+i,s.begin()+j);
                i=j+1;
                j++;
            }
            else j++;
        }
        reverse(s.begin()+i,s.begin()+j);
        return s;
    }
};

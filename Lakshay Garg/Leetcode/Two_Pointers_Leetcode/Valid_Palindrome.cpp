class Solution {
public:
    bool isPalindrome(string s) {
        if(s=="") return true;
        string st="";
        for(int i=0;i<s.size();i++){
            if((s[i]>='a' && s[i]<='z') || (s[i]>='0' && s[i]<='9')){
                st+=s[i];
            }
            else if(s[i]>='A' && s[i]<='Z'){
                st+=(s[i]+32);
            }
        }
        int i=0,j=st.size()-1;
        while(i<j){
            if(st[i]==st[j]){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
};

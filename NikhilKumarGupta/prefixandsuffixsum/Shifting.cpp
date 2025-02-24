class Solution {
    public:
        string shiftingLetters(string s, vector<int>& shifts) {
            int n=shifts.size();
            int suffixsum=0;
            for(int i=n-1;i>=0;i--){
                suffixsum+=shifts[i]%26;
                s[i]='a'+(s[i]-'a'+suffixsum)%26;
            }
            return s;
        }
    };
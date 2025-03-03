class Solution {
    public:
        string shiftingLetters(string s, vector<int>& shifts) {
            int n=shifts.size();
            vector<int> suffixSum(n,0);
            for(int i=n-2;i>=0;i--){
                shifts[i]=(shifts[i+1]+shifts[i])%26;
            }
            for(int i=0;i<n;i++){
                int shift=shifts[i];
                int newChar=(s[i]-'a'+shift)%26;
                s[i]='a'+newChar;
            }
            return s;
            
        }
    };
class Solution {
    public:
        int maxScore(string s) {
            int zeros =0;
            int ones=0;
            int max=0;
            int result=0;
            int n=s.size();
            for(int i=0;i<n;i++){
                if(s[i]=='1'){
                    ones++;
                }
            }
            for(int i=0;i<n-1;i++){
                if(s[i]=='0'){
                    zeros++;
                }
                else{
                    ones--;
                }
                result=zeros+ones;
                if(max<result){
                    max=result;
                }
            }
                return max;
            }
        };
class Solution {
    public:
        int maxScore(string s) {
            int n = s.length();
            int countOne=0;
            int countZero=0;
            for(int i =0;i<n;i++)
            if(s.at(i)=='1'){
                countOne++;
            }
            int maxi = 0;
            for(int j=0;j<n-1;j++)
            {
                if(s.at(j)=='0'){
                countZero++;
                }
              if( s.at(j)=='1'){
                    countOne--;
                }
                maxi = max(maxi,countZero +countOne);
            }
        
        return maxi;
        }
    };
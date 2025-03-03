class Solution {
    public:
        vector<int> platesBetweenCandles(string s, vector<vector<int>>& queries) {
            int n=s.size();
            vector<int> nLc(n); // nearest left candles
            vector<int> nRc(n);
            vector<int> nP(n); //nearest plates;
            for(int i=0;i<n;i++){
                if(s[i]=='|'){
                nLc[i]=i;
                }else{
                    nLc[i]=-1;
                }
            }
                for(int i=1;i<n;i++){
                    nLc[i]=max(nLc[i],nLc[i-1]);
                }
                for(int i=n-1;i>=0;i--){
                if(s[i]=='|'){
                nLc[i]=i;
                }else{
                    nLc[i]=-1;
                }
            }
                for(int i=1;i<n;i++){
                    nLc[i]=max(nLc[i],nLc[i-1]);
                }
    
        }
    };
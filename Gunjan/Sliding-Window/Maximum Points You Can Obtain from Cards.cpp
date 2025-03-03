class Solution {
public:
    int maxScore(vector<int>& v, int k) {
        int n=v.size(),ans=0;
        for(int i=0;i<k;i++) ans+=v[i];
        int count=ans;
        for(int i=k-1;i>=0;i--){
            count-=v[i];
            count+=v[n-k+i];
            ans = max(ans,count);
        }
        return ans;
    }
};

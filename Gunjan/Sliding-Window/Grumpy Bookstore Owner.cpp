class Solution {
public:
    int maxSatisfied(vector<int>& c, vector<int>& g, int m) {
        int n=c.size(),ans=0;
        for(int i=0;i<n;i++){
            if(g[i]==0) ans+=c[i];
        }
        int maxi=0,count=0;
        for(int i=0;i<m;i++){
            if(g[i]==1)count+=c[i];
        }
        maxi=count;
        int start=0,end=m-1;
        while(end<n-1){
            if(g[start]==1) count-=c[start];
            start++;
            end++;
            if(g[end]==1) count+=c[end];
            maxi=max(count,maxi);
        }
        ans+=maxi;
        return  ans;
    }
};

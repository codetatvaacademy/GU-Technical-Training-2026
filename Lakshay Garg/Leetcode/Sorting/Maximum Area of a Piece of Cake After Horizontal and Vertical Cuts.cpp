class Solution {
public: 
    const int MOD=1e9+7;
    int maxArea(int h, int w, vector<int>& hc, vector<int>& vc) {
        hc.push_back(h);
        vc.push_back(w);
        sort(hc.begin(),hc.end());
        sort(vc.begin(),vc.end());
        int x=hc[0],y=vc[0];
        for(int i=1;i<hc.size();i++) x=max((hc[i]-hc[i-1]),x);
        for(int i=1;i<vc.size();i++) y=max((vc[i]-vc[i-1]),y);
        long long ans=(1LL*x*y)%MOD;
        return (int)ans;
    }
};

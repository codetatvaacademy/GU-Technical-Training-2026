class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.size(),start=0,end=0,ans=0;
        if(n==0)return  0;
        if(n==1)return  1;
        vector<int>v(256,0);
        while(end<n){
            if(v[s[end]]>=start){
                start=v[s[end]];
            }
            v[s[end]]=end+1;
            ans=max(ans,end-start+1);
            end++;
        }
        return  ans;
    }
};

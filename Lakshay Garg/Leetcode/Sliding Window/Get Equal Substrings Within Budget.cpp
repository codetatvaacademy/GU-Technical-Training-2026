class Solution {
public:
    int equalSubstring(string s, string t, int m) {
        int start=0,end=0,ml=0,cost=0;
        while(end<s.size()){
            cost+=abs(s[end]-t[end]);
            while(cost>m){
                cost-=abs(s[start]-t[start]);
                start++;
            }
            ml=max((1+end-start),ml);
            end++;
        }
        return ml;
    }
};

class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& f,                vector<vector<int>>& s) {
        vector<vector<int>>v;
        int i=0,j=0;
        while(i<f.size() && j<s.size()) {
            int x=max(f[i][0],s[j][0]);
            int y=min(f[i][1],s[j][1]);
            if(x<=y) v.push_back({x,y});
            if(f[i][1]<s[j][1]) i++;
            else j++;
        }
        return v;
    }
};

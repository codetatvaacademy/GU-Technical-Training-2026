class Solution {
public:
    void sortColors(vector<int>& v) {
        int n=v.size();
        int n0=0,n1=0,n2=0;
        for(int i=0;i<n;i++){
            if(v[i]==0) n0++;
            else if(v[i]==1) n1++;
            else n2++;
        }
        v.clear();
        for(int i=0;i<n0;i++) v.push_back(0);
        for(int i=0;i<n1;i++) v.push_back(1);
        for(int i=0;i<n2;i++) v.push_back(2);
    }
};

class Solution {
public:
    void moveZeroes(vector<int>& v) {
        int n=v.size(),i=0,j=1;
        while(i<n && j<n){
            if(v[i]==0 && v[j]!=0){
                swap(v[i],v[j]);
                i++;
            }
            j++;
            if(v[i]!=0) i++;
        }
    }
};

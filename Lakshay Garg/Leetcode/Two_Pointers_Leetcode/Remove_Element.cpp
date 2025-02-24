class Solution {
public:
    int removeElement(vector<int>& v, int val) {
        int n=v.size();
        int s=0;
        for(int i=0;i<n;i++){
           if(v[i]!=val){
                v[s]=v[i];
                s++;
            }
        }
        return s;
    }
};

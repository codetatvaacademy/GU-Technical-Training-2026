class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& arr) {
        sort(arr.begin(),arr.end());
        vector<vector<int>>v;
        v.push_back(arr[0]);
        int i=0,j=0,n=arr.size();
        while(j<n){
            if(v[i][1]>=arr[j][0]){
                v[i][1]=max(v[i][1],arr[j][1]);
                j++;
            }
            else{
                v.push_back(arr[j]);
                i++;
                j++;
            }
        }
        return v;
    }
};

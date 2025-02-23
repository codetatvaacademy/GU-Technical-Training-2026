class Solution {
public:
    int minMoves2(vector<int>& arr) {
        int ans=0;
        sort(arr.begin(),arr.end());
        int x=arr[arr.size()/2];
        for(int it:arr) ans+=abs(it-x);
        return ans;
    }
};

class Solution {
public:
    int minIncrementForUnique(vector<int>& arr) {
        int ans=0;
        sort(arr.begin(),arr.end());
        for(int i=1;i<arr.size();i++){
            if(arr[i]<=arr[i-1]){
                int n=arr[i-1]+1;
                ans+=n-arr[i];
                arr[i]=n;
            }
        }
        return ans;
    }
};

class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& arr, int k) {
        int n=arr.size(),count=1,ans=0;
        for(int i=1;i<n+k-1;i++){
            if(arr[i%n]!=arr[(i-1)%n]) count++;
            else count=1;
            if(count>=k) ans++;
        }
        return ans;
    }
};

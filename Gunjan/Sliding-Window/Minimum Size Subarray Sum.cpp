class Solution {
public:
    int minSubArrayLen(int t, vector<int>& arr) {
        int n=arr.size();
        int i=0,j=i;
        int sum=0;
        int ans=INT_MAX;
        while(j<n){
            sum+=arr[j];
            while(sum>=t){
                ans=min(ans,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        if(ans==INT_MAX) return 0;
        return ans;
    }
};

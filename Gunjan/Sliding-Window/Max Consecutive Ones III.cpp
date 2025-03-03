class Solution {
public:
    int longestOnes(vector<int>& arr, int k) {
        int n=arr.size();
        int i=0,j=0,flip=0,ans=INT_MIN;
        while(j<n){
            if(arr[j]==1) j++;
            else{
                if(flip<k){
                    flip++;
                    j++;
                }
                else{
                    ans=max(ans,j-i);
                    while(arr[i]==1) i++;
                    i++;
                    j++;
                }
            }
        }
        ans=max(ans,j-i);
        return ans;
    }
};

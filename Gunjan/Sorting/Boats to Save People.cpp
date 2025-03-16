class Solution {
public:
    int numRescueBoats(vector<int>& arr, int l) {
        int ans=0;
        sort(arr.begin(),arr.end());
        int i=0,j=arr.size()-1;
        while(i<=j){
            if(arr[j]+arr[i]>l){
                ans++;
                j--;
            }
            else{
                ans++;
                i++;
                j--;
            }
        }
        return ans;
    }
};

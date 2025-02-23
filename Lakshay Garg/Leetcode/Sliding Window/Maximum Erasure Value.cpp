class Solution {
public:
    int maximumUniqueSubarray(vector<int>& arr) {
        int ans=0,count=0,n=arr.size(),start=0,end=0;
        unordered_set<int>st;
        while(end<n){
            if(!st.count(arr[end])){
                count+=arr[end];
                st.insert(arr[end]);
                ans=max(ans,count);
                end++;
            }
            else{
                count-=arr[start];
                st.erase(arr[start]);
                start++;
            }
        }
        return ans;
    }
};

class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        int n=arr.size();
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target) return {i+1,j+1};
            if(sum>target) j--;
            else if(sum<target) i++;
        }
        return {-1,-1};
    }
};

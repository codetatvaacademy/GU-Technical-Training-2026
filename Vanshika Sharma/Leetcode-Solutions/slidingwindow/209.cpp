#include<bits/stdc++.h>
using namespace std;
int minSubArrayLen(int target, vector<int>& nums) {
    int i=0;
    int j=0;
    int sum=0;
    int mini=INT_MAX;
    while(j<nums.size()){
        sum+=nums[j];
       while(i<=j&&sum>=target){
        mini=min(mini,j-i+1);
        sum-=nums[i];
        i++;
       }
j++;
        
    }
    return mini==INT_MAX?0:mini;
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
    cin>>arr[i];
    }
    int target;
    cin>>target;
    cout<<minSubArrayLen(target,arr)<<endl;
    return 0;
}

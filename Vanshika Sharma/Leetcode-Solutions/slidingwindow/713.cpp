#include<bits/stdc++.h>
using namespace std;
int numSubarrayProductLessThanK(vector<int>& nums, int k) {
    int i=0;
    int j=0;
    int cnt=0;
    int prod=1;
    while(j<nums.size()){
        prod*=nums[j];
        while(i<=j&&prod>=k){
            prod/=nums[i];
            i++;
        }
        cnt+=j-i+1;
        j++;
    }
    return cnt;
}
int main(){
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
    cin>>arr[i];
    }
    int k;
    cin>>k;
    cout<<numSubarrayProductLessThanK(arr,k)<<endl;
    return 0;
}
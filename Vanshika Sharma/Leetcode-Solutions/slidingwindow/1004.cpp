#include<bits/stdc++.h>
using namespace std;
int longestOnes(vector<int>& nums, int k) {
    //find longest subarray with k zeroes
    int i=0;
    int j=0;
    int maxlen=0;
    int  zero=0;
    while(j<nums.size()){
        if(nums[j]==0)zero++;
        while(i<=j&&zero>k){
            if(nums[i]==0)zero--;
            i++;
        }
        if(zero<=k){
            maxlen=max(maxlen,j-i+1);
        }
        j++;
    }
    return maxlen;
}
int main(){
    int n;
    vector<int>nums(n);
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    int k;
    cin>>k;
    cout<<longestOnes(nums,k)<<endl;
    return 0;
}
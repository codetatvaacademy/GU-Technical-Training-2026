#include<bits/stdc++.h>
using namespace std;
int solve(vector<int>&nums,int k){
    int cnt_odd=0;
    int i=0;
    int j=0;
    int  cnt_subarray=0;
    while(j<nums.size()){
        if(nums[j]%2)cnt_odd++;
        while(cnt_odd>k){
            if(nums[i]%2)cnt_odd--;
            i++;
        }
        cnt_subarray+=j-i+1;
        j++;
    }
return  cnt_subarray;
}
    int numberOfSubarrays(vector<int>& nums, int k) {
       //find subarray with <=k odd numbers
       //find subarrays with <=k-1 subarrays
       //subtract
       int cnt_subarray_k=solve(nums,k);
       int cnt_subarray_k1=solve(nums,k-1);
       return cnt_subarray_k-cnt_subarray_k1; 
    }
    int main(){
        int n;
        cin>>n;
        vector<int>nums(n);
        for(int i=0;i<n;i++){
            cin>>nums[i];
        }
        int k;
        cin>>k;
        int number_of_subarray=numberOfSubarrays(nums,k);
        cout<<number_of_subarray<<endl;
        return 0;
    }
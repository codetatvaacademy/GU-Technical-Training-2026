#include<bits/stdc++.h>
using namespace std;
int numOfSubarrays(vector<int>& arr, int k, int threshold) {
    int i=0;
    int j=0;
    int cnt=0;
    int curr_sum=0;
    while(j<arr.size()){
curr_sum+=arr[j];
if(j-i+1==k){
   if((curr_sum/k)>=threshold)cnt++;
   curr_sum-=arr[i];
   i++;
}
j++;
    }   
    return cnt;
   }
   int main(){
    int n;
    vector<int>arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int k,threshold;
    cin>>k>>threshold;
   
    cout<<numOfSubarrays(arr,k,threshold)<<endl;
    return 0;
   }
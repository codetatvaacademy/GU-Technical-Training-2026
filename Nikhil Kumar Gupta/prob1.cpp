#include <bits/stdc++.h>
using namespace std;

int solve (vector<int>&nums){
    int n=nums.size();
    int left =0;
    int total=0;
    
    for(int i=0;i<n;i++){
        total+=nums[i];
    }
    for(int i=0;i<n;i++){
        if(left==total-left-nums[i]){
            return i;
        }
        else{
            left+=nums[i];
        }
    }
    return -1;
}

int main() {
    vector<int>nums={1,-1,4};
   int ans= solve(nums);
    cout<<"index is"<<ans<<endl;


}
//tc 2N
//sc 1

#include<iostream>
#include<vector>
using namespace std;

int seeSaw(vector<int> &nums){
    int n = nums.size();
    vector<int> leftsum;
    vector<int> totalSum;

    leftsum[0] = nums[0];
    for(int i =1;i<n;i++){
        leftsum[i] = leftsum[i-1] + nums[i];
    }

    for(int i =0;i<n;i++){
        totalSum[i] = totalSum[i] + nums[i];
    }
    vector<int> ans;
    int res =0;
    for (int i = 0; i < n; i++)
    {
       ans[i] = totalSum[i]-nums[i];
       if(ans[i] == 0)
        res =i;
       else
       return -1;
    }
    return res;
}

int main(){
    // int size;
    // cout<<"Enter the size of array:";
    // cin>>size;
    // vector<int> nums(size);
    // cout<<"Enter the vector array:";
    // cin>> nums;

    vector<int>nums ={2,3,-1,8,4};
    return seeSaw(nums);
return 0;
}
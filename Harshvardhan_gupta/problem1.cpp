#include<iostream>
#include<vector>
using namespace std;


int balanceSeasaw(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sum[i];

        }
        int cummilativeSum=0;

        for(int i=0;i<n;i++){
            int leftsideSum=cummilativeSum;
            int rightsideSum=sum-cummilativeSum-nums[i];

            if(leftsideSum==rightsideSum){
                return i;
            }

            cummilativeSum+=nums[i];

        }
        return -1;
}


// TC -> O(N)
// SC -> O(1)

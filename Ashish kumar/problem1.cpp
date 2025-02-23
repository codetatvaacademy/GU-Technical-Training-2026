#include<iostream>
#include<vector>
using namespace std;

int middleIndex(int nums[] , int n) {
    //storing prefix_sum

    int leftSum[n];
    leftSum[0] = nums[0];

    for(int i=1 ; i<n ; i++) {
        leftSum[i] = leftSum[i-1] + nums[i];
    }

    
    
    //storing suffix_sum

    int rightSum[n];
    rightSum[n-1] = nums[n-1];

    for(int i=n-2 ; i>=0 ; i--) {
        rightSum[i] = rightSum[i+1] + nums[i];
    }

    //check for middleIndex

    for(int i=0 ; i<n ; i++) {
        if(leftSum[i] == rightSum[i]) {
            return i;
        }
        
    }
    
    return -1;
}

int main() {
    int n;
    cout << "Enter the number of peoples : " << endl;
    cin >> n;

    
    int nums[n];

    //filling the nums array

    for(int i=0 ; i<n ; i++) {
        cout << "Enter the weight of all the members at indexes : " << i << " is : ";
        cin >> nums[i];
    }

    cout << middleIndex(nums , n);
}
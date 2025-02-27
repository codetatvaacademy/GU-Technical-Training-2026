// WAP to take input 3 numbers and print the 2nd largest number among them.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int secondLargest(vector<int>&nums){
        sort(nums.begin(), nums.end());
        return nums[1];
    }
};
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    vector<int> nums;
    nums.push_back(a);
    nums.push_back(b);
    nums.push_back(c);
    solution sol;
    cout<<sol.secondLargest(nums);
}
// WAP to take input 3 numbers from the user and print the numbers in the descending order.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void descending_order(vector<int>&nums){
        sort(nums.begin(), nums.end(), greater<int>());
        for (int i = 0; i < nums.size();i++){
            cout << nums[i] << " ";
        }
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
    sol.descending_order(nums);
    return 0;
}
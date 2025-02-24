/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size = nums.size(), countZeros = 0, maxProduct = 1;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0){
                countZeros++;
                continue;
            }
            maxProduct = maxProduct * nums[i];
        }

        if(countZeros >= 2){
            vector<int> productAns(size, 0);
            return productAns;
        }

        vector<int> productAns(size, 1);
        for(int i = 0; i < size; i++){
            if(countZeros == 1 && nums[i] != 0){
                productAns[i] = 0;
            }else if(nums[i] == 0){
                productAns[i] = maxProduct;
            }else{
                productAns[i] = maxProduct / nums[i];
            }
        }

        return productAns;
    }
};


int main(){
    Solution test1;

    vector<int> nums = {1,2,3,4}, nums2 = {-1,1,0,-3,3}, ans;

    ans = test1.productExceptSelf(nums);
    cout<<"\n\t{ ";
    for(int i = 0; i < ans.size(); i++){
        cout<<ans[i]<<", ";
    }
    cout<<"}";

    ans = test1.productExceptSelf(nums2);
    cout<<"\n\t{ ";
    for(int i = 0; i < ans.size(); i++){
        cout<<ans[i]<<", ";
    }
    cout<<"}";
}
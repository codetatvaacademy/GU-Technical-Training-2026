/*905. Sort Array By Parity
Solved
easy

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    public:
        vector<int> sortArrayByParity(vector<int>& nums) {
            int evenPosition = 0, oddPosition = nums.size() - 1;
            vector<int> sortedByParity(nums.size(), 0);
    
            for(auto number : nums){
                if(number % 2 == 0){
                    sortedByParity[evenPosition++] = number;
                }
                else{
                    sortedByParity[oddPosition--] = number;
                }
            }
            return sortedByParity;
        }
};

int main(){
    int size;
    Solution sortByParity;
    cout<<"enter the size of vector ->>> ";
    cin>>size;

    vector<int> input(size, 0);
    for(int i = 0; i < size; i++){
        cout<<" \t Enter the number array ["<<i<<"] ->>";
        cin>>input[i];
        cout<<"\n";
    }

    vector<int> outPut = sortByParity.sortArrayByParity(input);
    
    cout<<"{";
    for (auto element : outPut)
    {
        cout<<element<<", ";
    }
    cout<<"}";
    
}
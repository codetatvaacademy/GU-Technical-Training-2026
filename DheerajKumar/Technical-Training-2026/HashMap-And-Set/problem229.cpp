/*229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?*/

#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
    public:
        vector<int> majorityElement(vector<int>& nums) {
            unordered_map <int, int> allOccurance;
    
            for(auto number : nums){
                allOccurance[number]++;
            }
    
            vector<int> output;
            for(auto entryes : allOccurance){
                if(entryes.second > nums.size() / 3){
                    output.push_back(entryes.first);
                }
            }
    
            return output;
        }
    };

int main(){
    int testCases;
    cout<<"Enetr numebr of TestCases ->> ";
    cin>>testCases;

    for(int i = 0; i < testCases; i++){
        vector<int> nums;
        int size;
        cout<<"\n Enter the size of nums -> ";
        cin>>size;

        for(int i = 0; i < size; i++){
            int input;
            cin>>input;

            nums.push_back(input);
        }

        Solution Test;
        vector<int> output = Test.majorityElement(nums);

        for(auto element : nums){
            cout<<element<<", ";
        }
    }
}
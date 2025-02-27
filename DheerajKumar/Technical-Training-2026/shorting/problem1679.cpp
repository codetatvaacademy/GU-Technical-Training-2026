/*1679. Max Number of K-Sum Pairs
Medium
Topics
Companies
Hint
You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.



Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 109
1 <= k <= 109*/

#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

// map solution
class SolutionMap
{
public:
    int maxOperations(vector<int> &nums, int k){
        unordered_map<int, int> numbers;
        int possibleMoveCount = 0;

        for (auto elements : nums){
            int remaning = k - elements;

            if (numbers[remaning] > 0){
                possibleMoveCount++;
                numbers[remaning]--;
            }
            else{
                numbers[elements]++;
            }
        }

        for (auto &entry : numbers){
            cout << entry.first << "- >" << entry.second << "\n";
        }
        return possibleMoveCount;
    }
};

class Solution {
    public:
        int maxOperations(vector<int>& nums, int k) {
    
            sort(nums.begin(), nums.end());
            int possibleMoveCount = 0;
    
            int start = 0, end = nums.size() - 1;
            while(start < end){
                if(nums[start] + nums[end] == k){
                    possibleMoveCount++;
                    start++;
                    end--;
                }
                else if(nums[start] + nums[end] > k){
                    end--;
                }
                else{
                    start++;
                }
            }
            return possibleMoveCount;
        }
    };

int main(){
    int numberOfTest;
    cout<<"\n\tEnter the Number of Test -> ";
    cin>>numberOfTest;

    for(int i = 0; i < numberOfTest; i++){
        vector<int> input;
        int size , k;

        cout<<"\n\tENter the value of K -> ";
        cin>>k;

        cout<<"\n\t Enter the size of Array -> ";
        cin>>size;

        for(int j = 0; j < size; j++){
            int numberinput;
            cin>>numberinput;
            input.push_back(numberinput);
        }
        Solution RunTest;
        cout<<"The number of Operations we can perform ->> "<<RunTest.maxOperations(input, k);
    }
}
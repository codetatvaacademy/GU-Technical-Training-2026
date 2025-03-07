/*525. Contiguous Array
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:

Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Example 3:

Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.*/


#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
    public:
        int findMaxLength(vector<int>& nums) {
            unordered_map<int, int> windowMapper;
            windowMapper[0] = -1;
    
            int sum = 0, maximumLength = 0;
    
            for(int i = 0; i < nums.size(); i++){
                sum += nums[i] == 0 ? -1 : 1;
    
                if(windowMapper.find(sum) != windowMapper.end()){
                    maximumLength = max(maximumLength, i - windowMapper[sum]);
                } else {
                    windowMapper[sum] = i;
                }
            }
    
            for(auto element : windowMapper){
                cout<<element.first<<", "<<element.second<<"\n";
            }
    
            return maximumLength;
        }
    };

    
int main(){
    int testCase;
    cout<<"\nEnter number of test cases ->> ";
    cin>>testCase;

    for(int i = 0; i < testCase; i++){
        vector<int> testInput;
        int size;
        cout<<"\n Enter size of input array ->>";
        cin>>size;
        
        cout<<"\n Enter only 0 & 1 \n \t ->> ";
        for(int j = 0; j < size; j++){
            int input;
            cin>>input;
            testInput.push_back(input);
        }

        Solution Test;
        cout<<"The Maximum Length of Contigious array is -> "<<Test.findMaxLength(testInput);
    }
}
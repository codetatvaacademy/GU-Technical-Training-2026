/*1726. Tuple with Same Product
Solved
Medium

Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.

 

Example 1:

Input: nums = [2,3,4,6]
Output: 8
Explanation: There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
Example 2:

Input: nums = [1,2,4,5,10]
Output: 16
Explanation: There are 16 valid tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 104
All elements in nums are distinct.
*/

#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

class Solution {
public:
    int tupleSameProduct(vector<int>& nums) {
        if(nums.size() < 4){
            return 0;
        }
        unordered_map<int, int> occurance;

        int start = 0, end, product = 0, totalOccurance = 0, totalCombinations = 0;
        while(start < nums.size() - 1){
            end = nums.size() - 1;
            
            while(end > start){
                product = nums[start] * nums[end];
            
                auto target = occurance.find(product);
                if(target != occurance.end()){
                    target->second++;
                }
                else{
                    occurance[product] = 1;
                }
                end--;
            }
            start++;
        }

        for(auto elements : occurance){
            totalOccurance = elements.second;
            if(totalOccurance > 1){
                totalCombinations += 8 * (totalOccurance * (totalOccurance - 1) / 2);
            }
        }
        return totalCombinations;
    }
};

int main(){
    Solution test;
    vector<int> input = {2,3,4,6};
    cout<<"\n\t -- Number of tuples that have same product -> "<<test.tupleSameProduct(input);

    input = {1,2,4,5,10};
    cout<<"\n\t -- Number of tuples that have same product -> "<<test.tupleSameProduct(input);
}
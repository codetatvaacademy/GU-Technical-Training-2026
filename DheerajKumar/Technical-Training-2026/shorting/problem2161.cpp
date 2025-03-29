/*2161. Partition Array According to Given Pivot

You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

Every element less than pivot appears before every element greater than pivot.
Every element equal to pivot appears in between the elements less than and greater than pivot.
The relative order of the elements less than pivot and the elements greater than pivot is maintained.
More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
Return nums after the rearrangement.

 

Example 1:

Input: nums = [9,12,5,10,14,3,10], pivot = 10
Output: [9,5,3,10,10,12,14]
Explanation: 
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
Example 2:

Input: nums = [-3,4,3,2], pivot = 2
Output: [-3,2,4,3]
Explanation: 
The element -3 is less than the pivot so it is on the left side of the array.
The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
 

Constraints:

1 <= nums.length <= 105
-106 <= nums[i] <= 106
pivot equals to an element of nums.*/


#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        vector<int> pivotArray(vector<int>& nums, int pivot) {
            int smaller = 0, larger = 0, equal = 0;
            for(auto numbers : nums){
                if(numbers == pivot){
                    equal++;
                }
                else if(numbers < pivot){
                    smaller++;
                }
                else{
                    larger++;
                }
            }
    
            vector<int> output (nums.size(), 0);
    
            int i = 0, j = smaller, k = equal + smaller;
    
            for(auto numbers : nums){
                if(numbers < pivot){
                    output[i++] = numbers; 
                }
                else if(numbers > pivot){
                    output[k++] = numbers;
                }
                else{
                    output[j++] = numbers;
                }
            }
            return output;
        }
    };



int main(){
    int testCase;
    cout<<"\n\tEnter the numbers of testCase ->> ";
    cin>>testCase;

    for(int i = 0; i < testCase; i++){
        vector<int> inputArray;
        int size;
        cout<<"\n\tenter the size ->> ";
        cin>>size;

        cout<<"Enter the array ->> ";
        for(int j = 0; j < size; j++){
            int enter;
            cin>>enter;

            inputArray.push_back(enter);
        }

        Solution Test;
        int pivot;
        cout<<"Enter Pivot ->> ";
        cin>>pivot;
        vector<int> output = Test.pivotArray(inputArray, pivot);

        for(auto numbers : output){
            cout<<numbers<<", ";
        }
    }
}
/*350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?*/

#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
    public:
        vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
            unordered_map<int, int> frequency;
    
            for(auto number : nums1){
                frequency[number]++;
            } 
            
            vector<int> output;
            for(auto number : nums2){
                if(frequency.find(number) != frequency.end()){
                    
                    output.push_back(number);
                    frequency[number]--;
    
                    if(frequency[number] == 0){
                        frequency.erase(number);
                    }
                }
            }
    
            return output;
        }
    };


int main(){
    int testcase;
    cout<<"Enter number of TestCase";
    cin>>testcase;

    for(int i = 0; i < testcase; i++){
        vector<int> nums1, nums2;
        int size1, size2;
        cout<<"ENter size of first Array -> ";
        cin>>size1;

        for(int j = 0; j < size1; j++){
            int input;
            cin>>input;

            nums1.push_back(input);
        }

        cout<<"enter the size of second array ->> ";
        cin>>size2;

        for(int k = 0; k < size2; k++){
            int input;
            cin>>input;

            nums2.push_back(input);
        }

        Solution Test;
        vector<int> output = Test.intersect(nums1, nums2);

        for(auto numebrs : output){
            cout<<numebrs<<", ";
        }
    }
}
/*1502

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

 

Example 1:

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Example 2:

Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 

Constraints:

2 <= arr.length <= 1000
-106 <= arr[i] <= 106*/

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
    public:
        bool canMakeArithmeticProgression(vector<int>& arr) {
            sort(arr.begin(), arr.end());
    
            vector<int> absoluteProgression;
            for(int i = 1; i < arr.size(); i++){
                absoluteProgression.push_back(arr[i] - arr[i - 1]); 
            }
            for(int i = 1; i < absoluteProgression.size(); i++){
                if(absoluteProgression[i] != absoluteProgression[i - 1]){
                    return false;
                }
            }
            return true;
        }
    };

int main(){
    int numberOfInput;
    cout<<"ENter the number of test cases ->  { ";
    cin>>numberOfInput;
    cout<<"} ";

    for(int i = 0; i < numberOfInput; i++){
        vector<int> testCase;
        int entry;
        cout<<"enter the size of array -> "; cin>>entry;
        
        for(int j = 0; j < entry; j++){
            int input; cin>>entry;
            testCase.push_back(entry);
        }

        Solution ClassTesting;
        if(ClassTesting.canMakeArithmeticProgression(testCase)){
            cout<<"\n\t -> True \n";
        }
        else{
            cout<<"\n\t ->False \n";
        }
        
    }
    return 0;
}
/*633. Sum of Square Numbers
Solved
Medium
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
 

Constraints:

0 <= c <= 231 - 1
*/

#include<iostream>
#include<vector>
#include<math.h>

using namespace std;

class Solution {
public:
    bool judgeSquareSum(int c) {
        int start = 0, end = sqrt(c);
        long long cal = 0;

        if(end * end == c){
            return true;
        }
        
        while(start <= end){
            cal = ((long long)(start * start) + (end * end));
            if(cal == c){
                return true;
            }
            else if(cal > c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
};

int main(){
    Solution test;
    int Input;

    cout<<"Enter the input the valid range{ (2^31) - 1} -> ";
    cin>>Input;

    if(test.judgeSquareSum(Input)){
        cout<<"Is valid and Can be maded with the combinations !";
    }
    else{
        cout<<"Not possible even with the combinations !";
    }
}
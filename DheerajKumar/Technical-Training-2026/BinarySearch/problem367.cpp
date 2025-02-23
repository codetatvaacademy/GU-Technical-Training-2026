/*
367

Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 

Constraints:

1 <= num <= 231 - 1
*/

#include<iostream>
using namespace std;

class Solution {
public:
    bool isPerfectSquare(int num) {
        long long minimum = 1, maximum = num, root = 0;

        while(minimum <= maximum){
            root = (minimum + maximum) / 2;
            
            if((long long)root * (long long)root == num){
                return true;
            }
            if((long long)root * (long long)root < num){
                minimum = root + 1;
            }
            else{
                maximum = root - 1;
            }
        }
        return false;
    }
};

int main(){
    Solution test;

    if(test.isPerfectSquare(16)){
        cout<<"\n\tIs a perfect square";
    }else{
        cout<<"\n\tnot a perfect square";
    }

    if(test.isPerfectSquare(6)){
        cout<<"\n\tIs a perfect square";
    }else{
        cout<<"\n\tnot a perfect square";
    }
}

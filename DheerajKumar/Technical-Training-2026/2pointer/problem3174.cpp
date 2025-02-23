/*
3174. Clear Digits
Solved

You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.

 

Example 1:

Input: s = "abc"

Output: "abc"

Explanation:

There is no digit in the string.

Example 2:

Input: s = "cb34"

Output: ""

Explanation:

First, we apply the operation on s[2], and s becomes "c4".

Then we apply the operation on s[1], and s becomes "".

 

Constraints:

1 <= s.length <= 100
s consists only of lowercase English letters and digits.
The input is generated such that it is possible to delete all digits.*/


#include<iostream>
#include<string>

using namespace std;

class Solution {
    public:
        string clearDigits(string s) {
            int start = 0, end = s.size() - 1;
            string outputString;
    
            for(start; start <= end; start++){
                if(int(s[start]) <= 57 && int(s[start]) >= 48){
                    outputString.pop_back();
                    continue;
                }
                outputString.push_back(s[start]);
            }
            return outputString;
        }
};

int main(){
    Solution test;

    string input = "cb34", output;

    output = test.clearDigits(input);
    for(auto character : output){
        cout<<character;
    }
    cout<<"\n";
    
    input = "bb22nnj67kk9";
    output = test.clearDigits(input);

    for(auto character : output){
        cout<<character;
    }
    cout<<"\n";
}


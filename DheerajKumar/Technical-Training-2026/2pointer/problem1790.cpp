/*You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 

Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.
 

Constraints:

1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        int countNonEqualPosition = 0, j = 0;
        vector<int> nonEqualPosition(2, -1);

        for(int i = 0; i < s1.size(); i++){
            if(s1[i] == s2[i]){
                continue;
            }

            countNonEqualPosition++;
            if(j <= 1){
                nonEqualPosition[j] = i;
                j++;
            }
            else{
                return false;
            }
        }

        if(countNonEqualPosition == 0){
            return true;
        }

        if(nonEqualPosition[0] != -1 && nonEqualPosition[1] != -1){

            if(s1[nonEqualPosition[0]] == s2[nonEqualPosition[1]] 
                && s1[nonEqualPosition[1]] == s2[nonEqualPosition[0]]){

                    return true;
                }
        }
        return false;
    }
};

int main(){
    Solution Test;
    
    string s1 = "aabbc", s2 = "cabba";
    if(Test.areAlmostEqual(s1, s2)){
        cout<<"\n\tThe string can be equal with one Swap !";
    }
    else{
        cout<<"\n\tString can't be equal with one swap !";
    }

    s1 = "bnak"; s2 = "bnek";
    if(Test.areAlmostEqual(s1, s2)){
        cout<<"\n\tThe string can be equal with one Swap !";
    }
    else{
        cout<<"\n\tString can't be equal with one swap !";
    }
}
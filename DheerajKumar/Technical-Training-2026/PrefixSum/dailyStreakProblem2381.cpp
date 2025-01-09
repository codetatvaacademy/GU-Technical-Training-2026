/*You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.

Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').

Return the final string after all such shifts to s are applied.

 

Example 1:

Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
Output: "ace"
Explanation: Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
Example 2:

Input: s = "dztz", shifts = [[0,0,0],[1,1,1]]
Output: "catz"
Explanation: Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".
 

Constraints:

1 <= s.length, shifts.length <= 5 * 104
shifts[i].length == 3
0 <= starti <= endi < s.length
0 <= directioni <= 1
s consists of lowercase English letters.*/


#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        int sizeString = s.size(), shifterLength = shifts.size(), countShift = 0;
        vector<int> prefixSum(sizeString + 1, 0);

        for(int i = 0; i < shifterLength; i++){
            
            prefixSum[shifts[i][0]] += shifts[i][2] == 0 ?  - 1 : shifts[i][2];

                prefixSum[shifts[i][1] + 1] -= shifts[i][2] == 0 ?  -1 : shifts[i][2];
                        
        }

        for(int i = 1; i <= sizeString; i++){
            prefixSum[i] += prefixSum[i - 1];

            countShift = ((s[i - 1] - 'a') + prefixSum[i - 1]) % 26;  //# converting to int and Adding and Taking modlus.
            if(countShift < 0){
                countShift += 26;
            }

            s[i - 1] = 'a' + countShift;
        }

        return s;
    }
};

int main(){
    Solution test;
    string case1 = "abc", case2 = "dztz", result;
    vector<vector<int>> inputCase1 = {{0,1,0},{1,2,1},{0,2,1}}, inputCase2 = {{0,0,0},{1,1,1}};

    cout<<"\n\t First Case Result -> \n\t";
    result = test.shiftingLetters(case1, inputCase1);
    for(auto x : result){
        cout<<x;
    }    

    cout<<"\n\t Second Case Result -> \n\t";
    result = test.shiftingLetters(case2, inputCase2);
    for(auto x : result){
        cout<<x;
    }    
}
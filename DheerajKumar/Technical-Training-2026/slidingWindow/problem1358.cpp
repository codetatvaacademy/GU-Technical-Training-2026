/*Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    int numberOfSubstrings(string s) {
        int n = s.size();
        int start = 0, end = 0, count = 0;
        int countA = 0, countB = 0, countC = 0;

        while (end < n) {
            if (s[end] == 'a') countA++;
            if (s[end] == 'b') countB++;
            if (s[end] == 'c') countC++;
            
            while (countA >= 1 && countB >= 1 && countC >= 1) {
                count += n - end;

                if (s[start] == 'a') countA--;
                if (s[start] == 'b') countB--;
                if (s[start] == 'c') countC--;
                start++;
            }
            
            end++;
        }

        return count;
    }
};

int main(){
    Solution test;
    string s = "abcabc";
    cout<<"\nno. of sub arrary -> "<<test.numberOfSubstrings(s);

    s = "aaabc";
    cout<<"\nno. of sub arrary -> "<<test.numberOfSubstrings(s);

    s = "abc";
    cout<<"\nno. of sub arrary -> "<<test.numberOfSubstrings(s);

}
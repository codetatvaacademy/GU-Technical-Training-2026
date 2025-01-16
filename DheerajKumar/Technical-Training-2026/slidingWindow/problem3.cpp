/*
3
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int start = 0, end = 0, maximumLength = 0, mapperIndex = 0;
        vector<int> mapper (128, 0);
        
        while(end < s.size()){
            mapperIndex = static_cast<int>(s[end]);
           
            start = max(mapper[mapperIndex], start); 
           
            maximumLength = max(maximumLength, (end - start) + 1);

            mapper[mapperIndex] = end + 1;

            end++;
        }
        return maximumLength;
    }
};

int main(){
    Solution test;

    string s = "abcabcbb";
    cout<<"Maximum sub Array length - > "<<test.lengthOfLongestSubstring(s);
}

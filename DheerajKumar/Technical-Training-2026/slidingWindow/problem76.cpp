/*
Given two strings s and t of lengths m and n respectively, return the minimum window 
substring
 of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
 

Follow up: Could you find an algorithm that runs in O(m + n) time?*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    string minWindow(string s, string t) {
        int sSize = s.size(), tSize = t.size();

        if(sSize < tSize){
            return "";
        }
        
        int uniqueCounter = 0, validStart = -1, end = 0, start = 0, minLength = sSize + 1;
        vector<int> inTString (128, 0), inSString(128, 0);

        for(int i = 0; i < tSize; i++){
            if(inTString[(int)t[i]]++ == 0){
                uniqueCounter++;
            }
        }

        while(end < sSize){
            inSString[(int)s[end]]++;
            if(inSString[s[end]] == inTString[s[end]]){
                uniqueCounter--;
            }

            while(uniqueCounter == 0){
                if(end - start + 1 < minLength){
                    validStart = start;
                    minLength = end - start + 1;
                }

                if(inSString[s[start]] == inTString[s[start]]){
                    uniqueCounter++;
                } 

                inSString[s[start]]--;
                start++;
            }
            end++;
        }
        return validStart == -1 ? "": s.substr(validStart, minLength);
    }
};

int main(){
    Solution test;

    string s = "ADOBECODEBANC", t = "ABC", outPut;
    outPut = test.minWindow(s, t);

    cout<<"\n \tthe minimum sub string -> ";
    for(auto character : outPut){
        cout<<character;
    }
    cout<<"\n";

    s = "a"; t = "a";
    outPut = test.minWindow(s, t);

    cout<<"\n \tthe minimum sub string -> ";
    for(auto character : outPut){
        cout<<character;
    }
    cout<<"\n";

    s= "a"; t = "aa";
    outPut = test.minWindow(s, t);

    cout<<"\n \tthe minimum sub string -> ";
    for(auto character : outPut){
        cout<<character;
    }
    cout<<"\n";
}
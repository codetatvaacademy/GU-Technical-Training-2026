/*
Given two strings s1 and s2, return true if s2 contains a 
permutation
 of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if (s1.size() > s2.size()) return false;

        vector<int> s1Freq(26, 0), windowFreq(26, 0);

        for (char c : s1) {
            s1Freq[c - 'a']++;
        }

        int windowSize = s1.size();
        for (int i = 0; i < s2.size(); i++) {
            windowFreq[s2[i] - 'a']++;

            if (i >= windowSize) {
                windowFreq[s2[i - windowSize] - 'a']--;
            }

            if (s1Freq == windowFreq) {
                return true;
            }
        }

        return false;
    }
};

int main(){
    Solution test;

    string input1 = "ab", input2 = "eidbaooo";
    if(test.checkInclusion(input1, input2)){
        cout<<"string have the subString !";
    }
    else{
        cout<<"string dont have the sub string !";
    }

}
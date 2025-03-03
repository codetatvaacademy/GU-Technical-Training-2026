/*

    2185 Daily Question 9/1/25
    
    
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

 

Example 1:

Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length, pref.length <= 100
words[i] and pref consist of lowercase English letters.
*/


#include<iostream>
#include<vector>
#include<string>
using namespace std;

class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int lengthOfPref = pref.size(), noOfWords = words.size(), count  = noOfWords;

        for(int i = 0; i < noOfWords; i++){
            for(int j = 0; j < lengthOfPref; j++){
                if(words[i][j] != pref[j]){
                    count -= 1;
                    break;
                }
            }
        }

        return count;
    }
};

int main(){
    Solution test;
    string match1 = "at", match2 = "code";
    vector<string> input1 = {"pay","attention","practice","attend"}, input2 = {"leetcode","win","loops","success"};
    cout<<"\n\tNumber of prefix int test case 1-> "<<test.prefixCount(input1, match1);
    cout<<"\n\tNumber of prefix int test case 2-> "<<test.prefixCount(input2, match2);
    
}
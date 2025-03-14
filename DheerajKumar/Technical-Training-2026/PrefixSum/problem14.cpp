/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Solution {
    public:
        string longestCommonPrefix(vector<string>& strs) {
            if(strs.size() == 1){
                return strs[0];
            }
    
            string prefix = strs[0];
            int size = prefix.size();
    
            for(int i = 1; i < strs.size(); i++){
                while(size > strs[i].size() || prefix != strs[i].substr(0,size)){
                    size--;
                    if(size == 0){
                        return "";
                    }
                    prefix = prefix.substr(0,size);
                }
            }
            return prefix;
        }
    };


int main(){
    int testCases;
    cout<<"Enter number of TestCases -> ";
    cin>>testCases;

    for(int i = 0; i < testCases; i++){
        vector<string> input;
        int size;
        cout<<"Enter number of words -> ";
        cin>>size;
        cin.ignore();

        for(int j = 0; i < size; i++){
            string word;
            getline(cin, word);
            input.push_back(word);
        }
        Solution test;

        string output = test.longestCommonPrefix(input);
        for(auto character : output){
            cout<<character;
        }
        cout<<"\n";
    }
}
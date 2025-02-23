#include<iostream>
#include<vector>
#include<limits.h>
#include<string>

using namespace std;

class Solution {
public:
    int longestSemiRepetitiveSubstring(string s) {
        if(s.size() <= 1){
            return 1;
        }

        int start = 0, end = 1, count = 0, maxSize = 0, firstNonValid = 0;

        while(end < s.size()){
            if(s[end] == s[end - 1]){
                count++;
            }

            while (count > 1) {
                if (s[start] == s[start + 1]) {
                    count--;
                }
                start++;
            }
            maxSize = max(maxSize, end - start + 1);
            end++;
        }
        return maxSize;
    }
};


int main(){
    Solution test;

    string s;
    cout<<"Enter the string ->> ";
    getline(cin, s);

    cout<<"maximum length -> "<<test.longestSemiRepetitiveSubstring(s);
}

//4411798
/* complaxity -> O(n)
    space complaxity -> O(1)
    
    excluding the input time and space complaxity !*/
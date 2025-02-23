#include<iostream>
#include<limits.h>
#include<vector>
#include<string>

using namespace std;

class Solution {
public:
    int longestBeautifulSubstring(string word) {
        int start = 0, maxLength = 0, uniqueVowels = 1;

        for (int end = 1; end < word.size(); end++) {
            if (word[end] < word[end - 1]) {
                start = end;
                uniqueVowels = 1;
            } 
            else if (word[end] > word[end - 1]) {  
                uniqueVowels++;
            }

            if (uniqueVowels == 5) {  
                maxLength = max(maxLength, end - start + 1);
            }
        }
        
        return maxLength;
    }
};


int main(){
    Solution test;

    string s;
    cout<<"enetr the string ->> ";
    getline(cin, s);

    cout<<"the maximum Lenght -> "<<test.longestBeautifulSubstring(s);
}


/*complaxity -> time  O(n)
    space -> O(1)*/
/*899. Orderly Queue

You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string.

Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.

 

Example 1:

Input: s = "cba", k = 1
Output: "acb"
Explanation: 
In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".
Example 2:

Input: s = "baaca", k = 3
Output: "aaabc"
Explanation: 
In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".
 

Constraints:

1 <= k <= s.length <= 1000
s consist of lowercase English letters.*/

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
    string rotate(string s){
        return s.size() > 1 ? s.substr(1) + s[0] : s;
    }
public:
    string orderlyQueue(string s, int k) {
        if(s.size() <= 1){
            return s;
        }
        
        if(k > 1){
            sort(s.begin(), s.end());
            return s;
        }
        else{
            string previousString = s, smallest = s;

            for(auto character : s){
                previousString = rotate(previousString);

                if(smallest > previousString){
                    smallest = previousString;
                }
            }
            return smallest;

        }
    }
};

int main(){
    int testCases;
    cout<<"\n\tEnter the number of test case ->> ";
    cin>>testCases;
    cin.ignore();

    for(int i = 0; i < testCases; i++){
        string userInput;
        int maximumWindow;

        cout<<"\n\tEnter the string - >> ";
        getline(cin, userInput);
        
        cout<<"\n\tEnter the maximumm window operation can take place - >>> ";
        cin>>maximumWindow;
        cin.ignore();

        Solution Test;
        string outPut = Test.orderlyQueue(userInput, maximumWindow);

        cout<<"\n\tThe smallest lexoligical order - > ";
        for(auto character : outPut){
            cout<<character;
        }
    }
}
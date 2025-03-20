/*1002. Find Common Characters
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.*/

#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

class Solution {
    public:
        vector<string> commonChars(vector<string>& words) {
            vector<int> orderMapper(26, 0);
    
            for (auto character : words[0]) {
                orderMapper[character - 'a']++;
            }
    
            for (int i = 1; i < words.size(); i++) {
    
                vector<int> newVector(26, 0);
                for (auto character : words[i]) {
                    newVector[character - 'a']++;
                }
    
                for (int j = 0; j < 26; j++) {
                    orderMapper[j] = min(orderMapper[j], newVector[j]);
                }
            }
    
            vector<string> result;
            for (int j = 0; j < 26; j++) {
                while (orderMapper[j] > 0) {
                    result.push_back(string(1, j + 'a'));
                    orderMapper[j]--;
                }
            }
            return result;
        }
    };


int main(){
    
}
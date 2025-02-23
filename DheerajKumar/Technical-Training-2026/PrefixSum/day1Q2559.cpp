/*You are given a 0-indexed array of strings words and a 2D array of integers queries.

Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
Output: [2,3,0]
Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
The answer to the query [0,2] is 2 (strings "aba" and "ece").
to query [1,4] is 3 (strings "ece", "aa", "e").
to query [1,1] is 0.
We return [2,3,0].
Example 2:

Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
Output: [3,2,1]
Explanation: Every string satisfies the conditions, so we return [3,2,1].
 

Constraints:

1 <= words.length <= 105
1 <= words[i].length <= 40
words[i] consists only of lowercase English letters.
sum(words[i].length) <= 3 * 105
1 <= queries.length <= 105
0 <= li <= ri < words.length */

#include<iostream>
#include<vector>
#include<string>
using namespace std;

class Solution {
public:
    int validString(string& word){
        int length = word.size();
        
        if((word[0] == 'a' || word[0] == 'e' || word[0] == 'i' || word[0] == 'o' || word[0] == 'u') &&
            (word[length - 1] == 'a' || word[length - 1] == 'e' || word[length - 1] == 'i' || word[length - 1] == 'o' ||
                word[length - 1] == 'u')){
                    return 1;
                }
                else{
                    return 0;
                }
    }

    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        int size = words.size();
        vector<int> dyArray(size, 0);
        if(size <= 0){
            return dyArray;
        }

        int currentValue = 0;
        for(int i = 0; i < size; i++){
            currentValue = currentValue + validString(words[i]);
            dyArray[i] = currentValue;
        }

        int sizeQueue = queries.size();
        vector<int> queueList(sizeQueue, 0);

        for(int i = 0; i < sizeQueue; i++){
            if(queries[i][0] < 1 ){
                queueList[i] = dyArray[queries[i][1]];
            }else{
                queueList[i] = dyArray[queries[i][1]] - dyArray[queries[i][0] - 1];
            }
        }
        return queueList;
    }
};

int main(){
    Solution test1;
    vector<string> words = {"aba","bcb","ece","aa","e"};
    vector<vector<int>> queue = {{0,2},{1,4},{1,1}};

    vector<int> queueTest = test1.vowelStrings(words, queue);

    cout<<"\n\n[ ";
    for(int element : queueTest){
        cout<<element<<", ";
    }
    cout<<"]";
}
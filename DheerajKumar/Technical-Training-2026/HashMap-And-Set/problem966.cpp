/*966. Vowel Spellchecker
Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.

For a given query word, the spell checker handles two categories of spelling mistakes:

Capitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the case in the wordlist.
Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually, it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match in the wordlist.
Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
In addition, the spell checker operates under the following precedence rules:

When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
When the query matches a word up to capitlization, you should return the first such match in the wordlist.
When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
If the query has no matches in the wordlist, you should return the empty string.
Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].



Example 1:

Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
Example 2:

Input: wordlist = ["yellow"], queries = ["YellOw"]
Output: ["yellow"]


Constraints:

1 <= wordlist.length, queries.length <= 5000
1 <= wordlist[i].length, queries[i].length <= 7
wordlist[i] and queries[i] consist only of only English letters.*/

#include <iostream>
#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <string>

using namespace std;

class Solution
{
public:
    vector<string> spellchecker(vector<string> &wordlist,
                                vector<string> &queries){
        unordered_set<string> wordList;
        unordered_map<string, string> Captalization;
        unordered_map<string, string> Vovel;

        for (auto word : wordlist){
            wordList.insert(word);
        }

        for (auto word : wordlist){
            string smallerSpace;
            for (auto character : word){
                smallerSpace.push_back(tolower(character));
            }

            if (Captalization.find(smallerSpace) == Captalization.end()){
                Captalization[smallerSpace] = word;
            }
        }

        for (auto word : wordlist){
            string vovelSpace;

            for (auto character : word){
                if (character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u' || character == 'A' ||
                    character == 'E' || character == 'I' || character == 'U' ||
                    character == 'O'){
                    vovelSpace.push_back('*');
                }
                else{
                    vovelSpace.push_back(tolower(character));
                }
            }

            if (Vovel.find(vovelSpace) == Vovel.end()){
                Vovel[vovelSpace] = word;
            }
        }

        cout << "Matching -> \n";
        for (auto x : wordList){
            for (auto y : x){
                cout << y;
            }
            cout << "\n";
        }

        cout << "Captalization -> \n";
        for (auto x : Captalization){
            for (auto Y : x.first){
                cout << Y;
            }
            cout << " : ";
            for (auto y : x.second){
                cout << y;
            }
            cout << "\n";
        }

        cout << "Vovel -> \n";
        for (auto x : Vovel){
            for (auto Y : x.first){
                cout << Y;
            }
            cout << " : ";
            for (auto y : x.second){
                cout << y;
            }
            cout << "\n";
        }

        vector<string> result;
        for (auto queueWord : queries) {
            //making normal lowercase🅰️
            if (wordList.find(queueWord) == wordList.end()) {   //✅check actual list
                string word;    //making character lowercase 🅰️
                for (auto character : queueWord) {             
                    word.push_back(tolower((character)));
                }

                if (Captalization.find(word) == Captalization.end()) {   //✅check capital list
                    string vovel;       //making vovel word 🅰️
                    for (auto character : queueWord) {
                        if (character == 'a' || character == 'e' ||
                            character == 'i' || character == 'o' ||
                            character == 'u' || character == 'A' ||
                            character == 'E' || character == 'I' ||
                            character == 'U' || character == 'O') {
                            vovel.push_back('*');
                        } else {
                            vovel.push_back(tolower(character));
                        }
                    }
                    if(Vovel.find(vovel) == Vovel.end()){               //✅check vovel list
                        result.push_back("");
                    }
                    else{
                        result.push_back(Vovel[vovel]);
                    }
                } else {
                    result.push_back(Captalization[word]);
                }
            } else {
                result.push_back(
                    queueWord); // ✅if word is directly matching add same word!
            }
        }

        return result;
    }
};


int main (){
    int testcase;
    cout<<"\n - > Enter numbers of testcases -> ";
    cin>>testcase;
    cin.ignore();


    for(int i = 0; i < testcase; i++){
        vector<string> testSample;
        vector<string> queue;
        string input;
        cout<<"\n - >Enter the words with space sepration ->> ";
        getline(cin, input);

        string word;
        for(auto character : input){
            if(character == ' '){
                testSample.push_back(word);
                word.clear();
            }
            else{
                word.push_back(character);
            }
        }
        
        cout<<"\n -> ENter queue with space seprations -> ";
        getline(cin, input);

    
        for(auto character : input){
            if(character == ' '){
                queue.push_back(word);
                word.clear();
            }
            else{
                word.push_back(character);
            }
        }
        
        Solution classTesting;
        vector<string> output = classTesting.spellchecker(testSample, queue);
        cout<<"\n output - >";
        for(auto word : output){
            for(auto charcter : word){
                cout<<charcter;
            }
            cout<<" - ";
        }
    }
}
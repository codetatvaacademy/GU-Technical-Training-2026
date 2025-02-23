class Solution {
public:
    string reversePrefix(string word, char ch) {
        int pos = 0;
        for(int i = 0; i < word.size(); ++i){
            if(word[i] == ch){
                pos = i;
                break;
            }
        }
        reverse(word.begin(), word.begin() + pos + 1);
        return word;
    }
};
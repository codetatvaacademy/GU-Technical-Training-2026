//344
class Solution {
public:
    void reverseString(vector<char>& s) {
        int left = 0;
        int right = s.size() - 1;
        
        while (left < right) {
            swap(s[left], s[right]);
            left++;
            right--;
        }
    }
};

//200
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

//557
class Solution {
public:
    string reverseWords(string s) {
        int start = 0, end = 0;
        while (end < s.length()) {
            while (end < s.length() && s[end] != ' ') {
                end++;
            }
            reverse(s.begin() + start, s.begin() + end);
            start = ++end;
        }
        return s;
    }
};

//

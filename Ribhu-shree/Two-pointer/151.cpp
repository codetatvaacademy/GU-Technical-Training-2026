class Solution {
    public:
        string reverseWords(string s) {
            int n = s.size();
            int start = 0;
            vector<string> words;
            string answer;
            while (start < n) {
                while (start < n && s[start] == ' ') {
                    start++;
                }
                if (start >= n) {
                    break;
                }
                int end = start;
                while (end < n && s[end] != ' ') {
                    end++;
                }
    
                words.push_back(s.substr(start, end - start));
                start = end + 1;
            }
            reverse(words.begin(), words.end());
    
            for (int i = 0; i < words.size(); i++) {
                if (i > 0)answer += " ";
                answer += words[i];
            }
            return answer;
        }
    };
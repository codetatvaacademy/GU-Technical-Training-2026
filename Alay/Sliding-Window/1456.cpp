class Solution {
public:
    int maxVowels(string s, int k) {
        int vowelCount = 0, maxVowelCount = 0;
        int start = 0;
        for (int i = 0; i < s.size(); i++) {
            vowelCount += isVowel(s[i]); 
            if (i >= k-1) {
                maxVowelCount = std::max(vowelCount, maxVowelCount);
                vowelCount -= isVowel(s[start]);
                start++;
            }
        }

        return maxVowelCount;
    }

    bool isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
};
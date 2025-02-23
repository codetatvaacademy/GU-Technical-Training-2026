class Solution {
public:
    int compress(vector<char>& chars) {
        int currentChar = chars[0];
        int currentCount = 1;
        int indexAns = 0;

        for (int i = 1; i <= chars.size(); i++) {
            if (i < chars.size() && chars[i] == currentChar) {
                currentCount++;
            } else {
                chars[indexAns++] = currentChar;
                if (currentCount > 1) {
                    for (char c : to_string(currentCount)) {
                        chars[indexAns++] = c;
                    }
                }
                if (i < chars.size()) {
                    currentChar = chars[i];
                    currentCount = 1;
                }
            }
        }

        return indexAns;
    }
};
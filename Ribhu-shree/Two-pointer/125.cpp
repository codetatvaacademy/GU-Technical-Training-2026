class Solution {
    public:
        bool isPalindrome(string s) {
            int left = 0, right = s.size() - 1;
    
            while (left < right) {
                if (!((s[left] >= 'a' && s[left] <= 'z') ||
                      (s[left] >= 'A' && s[left] <= 'Z') ||
                      (s[left] >= '0' && s[left] <= '9'))) {
                    left++;
                    continue;
                } else if (!((s[right] >= 'a' && s[right] <= 'z') ||
                             (s[right] >= 'A' && s[right] <= 'Z') ||
                             (s[right] >= '0' && s[right] <= '9'))) {
                    right--;
                    continue;
                }
                if (tolower(s[left]) != tolower(s[right])) {
                    return false;
                }
                left++;
                right--;
            }
    
            return true;
        }
    };
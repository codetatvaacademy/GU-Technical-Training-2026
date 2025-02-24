class Solution {
    public:
     // Pass the string by reference to avoid copying
        bool check(const string& s, int l, int r) {
            if (l >= r) {
                return true;
            }
            if (s[l] != s[r]) {
                return false;
            }
            return check(s, l + 1, r - 1);
        }
        
        bool isPalindrome(string s) {
            string filter;
            for(char c:s){
                if(isalnum(c)){
                    filter+=tolower(c);
                }
            }
            int n = filter.size();
            return check(filter, 0, n - 1);
        }
    };
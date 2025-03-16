class Solution {
    public:
       
        string reverseOnlyLetters(string s) {
            int left=0;
            int right=s.size()-1;
            while(left <right){
                if (!((s[left] >= 'a' && s[left] <= 'z') || (s[left] >= 'A' && s[left] <= 'Z'))){
                    left++;
                    continue;
                }
                if (!((s[right] >= 'a' && s[right] <= 'z') || (s[right] >= 'A' && s[right] <= 'Z'))){
                    right--;
                    continue;
                }
                swap(s[left],s[right]);
                left++;
                right--;
            }
            
            
            
            return s;
             
        }
    };
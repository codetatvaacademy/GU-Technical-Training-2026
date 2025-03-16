class Solution {
    public:
        string reverseWords(string s) {
            int space = 0;
            int n = s.size();
            for (int i = 0;i<=n;i++){
                if(i==s.size() || s[i]==' ' ){
                    int left = space;
                    int right = i-1;
                    space = i+1;
                    while(left<right){
                        swap(s[left], s[right]);
                        left++;
                        right--;
                    }
                    
    
                }
                
            }
            return s;
        }
    
    };
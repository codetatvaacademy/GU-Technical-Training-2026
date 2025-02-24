class Solution {
    public:
        int compress(vector<char>& chars) {
            int l = 0, r = 0;
            int count = 1;
            while (r < chars.size()) {
                if (r +1<chars.size() && chars[r] == chars[r + 1]) {
                    count++;
                } else{
                    chars[l] = chars[r];
                    l++;
                    if (count > 1) {
    
                        for (auto i : to_string(count)) {
                            chars[l] = i;
                            l++;
                        }
                    }
                    count = 1;
                }
                r++;
            }
    
            return l;
        }
    
    }; 
    
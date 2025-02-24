class Solution {
    public:
        int numberOfSubstrings(string s) {
            unordered_map<char,int> map;
            int n = s.size();
            int sub_count=0;
            int l = 0,r=0;
            if(s.size()<3){
                return 0;
            }
    
            while(r <=n){ 
                while(r <=n && !(map['a'] > 0 && map['b'] > 0 && map['c'] > 0 ) ){
                    map[s[r]]++; 
                    r++;        
                }
                if(map['a'] > 0 && map['b'] > 0 && map['c'] > 0 ){
                    sub_count += (n-r+1);
                } 
                      
                map[s[l]]--;
                l++;
    
            }
            return sub_count;
        }
    };
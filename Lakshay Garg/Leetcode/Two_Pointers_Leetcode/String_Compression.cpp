class Solution {
public:
    int compress(vector<char>& v) {
        int n=v.size();
        int ptr=0,i=0;
        while(i<n){
            char cur=v[i];
            int count=0;
            while(i<n && v[i]==cur){
                count++;
                i++;
            }
            v[ptr]=cur;
            ptr++;
            if(count>1){
                string s=to_string(count);
                for(int i=0;i<s.size();i++){
                    v[ptr]=s[i];
                    ptr++;
                }
            }
        }
        return ptr;
    }
};

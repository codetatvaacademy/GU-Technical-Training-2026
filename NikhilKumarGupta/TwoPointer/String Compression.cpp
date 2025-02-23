class Solution {
    public:
        int compress(vector<char>& chars) {
           int n=chars.size();
           int idx=0;
           for(int i=0;i<n;i++){
            int count=0;
            char ch=chars[i];
            while(i<n&&ch==chars[i]){
                count++;
                i++;
            }
            if(count==1){
                chars[idx]=ch;
                idx++;
            }
            else{
                 chars[idx]=ch;
                idx++;
                string county=to_string(count);
                for(char digit:county){
                    chars[idx]=digit;
                    idx++;
                }
            }
            i--;
           }
           return idx;
        }
    };
class Solution {
public:
    int numberOfSubstrings(string s) {
        vector<int> ans(3, -1);
        int count = 0;
        for(int i = 0; i < s.size(); ++i){
            if(s[i] == 'a'){
                ans[0] = i;
            }
            if(s[i] == 'b'){
                ans[1] = i;
            }
            if(s[i] == 'c'){
                ans[2] = i;
            }
            if(ans[0] != -1 && ans[1] != -1 && ans[2] != -1){
                count += 1 + min(ans[0], min(ans[1], ans[2]));
            }
        }
        return count;
    }
};
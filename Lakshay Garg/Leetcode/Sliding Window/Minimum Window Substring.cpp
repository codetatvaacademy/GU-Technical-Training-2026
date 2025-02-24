class Solution {
public:
    string minWindow(string s, string t) {
        int start=0,end=0,mini=INT_MAX,f=-1,l=-1,count=0;
        vector<int>ft(126,0);
        vector<int>fs(126,0);
        for(char c:t){
            ft[c]++;
        }
        for(int i=0;i<126;i++){
            if(ft[i]!=0) count++;
        }
        while(end<s.size()){
            char c=s[end];
            fs[c]++;
            if(fs[c]==ft[c]) count--;
            while(count==0){
                if(mini>end-start+1){
                    f=start,l=end,mini=end-start+1;
                }
                char ch=s[start];
                if(fs[ch]==ft[ch]) count++;
                fs[ch]--;
                start++;
            }
            end++;
        }
        if(f==-1) return "";
        return s.substr(f,mini);
    }
};

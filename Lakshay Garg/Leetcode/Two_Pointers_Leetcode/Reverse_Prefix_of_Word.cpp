class Solution {
public:
    string reversePrefix(string w, char ch) {
        int pos=-1;
        for(int i=0;i<w.size();i++){
            if(w[i]==ch){
                pos=i;
                break;
            }
        }
        reverse(w.begin(),w.begin()+pos+1);
        return w;
    }
};

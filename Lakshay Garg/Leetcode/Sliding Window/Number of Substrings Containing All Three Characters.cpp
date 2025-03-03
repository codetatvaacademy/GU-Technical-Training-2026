class Solution {
public:
    int numberOfSubstrings(string s) {
        int end=0,ans=0;
        int arr[3]={-1,-1,-1};
        while(end<s.size()){
            arr[s[end]-'a']=end;
            if(arr[0]>-1 && arr[1]>-1 && arr[2]>-1) ans+=1+min(arr[0],min(arr[1],arr[2]));
            end++;
        }  
        return ans;
    }
};

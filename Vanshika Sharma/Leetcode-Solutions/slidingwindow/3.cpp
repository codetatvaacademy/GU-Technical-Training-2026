#include<bits/stdc++.h>
using namespace std;
int lengthOfLongestSubstring(string s) {
    int i=0;
    int j=0;
   int maxlen=0;
   vector<int>freq(128,0);
   while(j<s.size()){
    freq[s[j]]++;
    while(i<=j&&freq[s[j]]>1){
        freq[s[i]]--;
        i++;
    }
    maxlen=max(maxlen,j-i+1);
    j++;
   }
   return maxlen;
}
int main(){
    string s;
    cin>>s;
    cout<<lengthOfLongestSubstring(s)<<endl;
    return 0;
}
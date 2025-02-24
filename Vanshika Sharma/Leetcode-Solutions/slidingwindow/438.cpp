#include<bits/stdc++.h>
using namespace std;
vector<int> findAnagrams(string s, string p) {
    vector<int>ans;
    int i=0;
    int j=0;int unique=0;
    vector<int>freq1(26,0);
    vector<int>freq(26,0);
    for(int i=0;i<p.size();i++){
     freq1[p[i]-'a']++;
     if(freq1[p[i]-'a']==1)unique++;
    }
    int cnt=0;
    while(j<s.size()){
     freq[s[j]-'a']++;
     if(freq[s[j]-'a']==freq1[s[j]-'a'])cnt++;
     if(j-i+1==p.size()){
         if(unique==cnt)ans.push_back(i);
         freq[s[i]-'a']--;
         if(freq1[s[i]-'a']-1==freq[s[i]-'a'])cnt--;
         i++;
     }
     j++;
    }
return ans;
 }
 int main(){
    string s,t;
    cin>>s;
    cin>>t;
    vector<int>ans=findAnagrams(s,t);
    for(int i=0;i<ans.size();i++){
        cout<<ans[i]<<" ";
    }
    return 0;
 }
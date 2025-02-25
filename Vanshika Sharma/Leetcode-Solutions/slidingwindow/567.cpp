#include<bits/stdc++.h>
using namespace std;
bool checkInclusion(string s1, string s2) {
    int i=0;
    int j=0;
    int unique=0;
    unordered_map<char,int>mp;
    for(int i=0;i<s1.size();i++){
       mp[s1[i]]++;
        if(mp[s1[i]]==1)unique++;
    }
    while(j<s2.size()){
        if(mp.find(s2[j])!=mp.end()){
            mp[s2[j]]--;
            if(mp[s2[j]]==0)unique--;
        }
       
       if(j-i+1==s1.size()){
            if(unique==0)return true;
           
                if(mp.find(s2[i])!=mp.end()){
                    mp[s2[i]]++;
                    if(mp[s2[i]]==1)unique++;
                }
                i++;
           
            
        } j++;
        }
        return false;
}
int main(){
    string s1,s2;
    cin>>s1;
    cin>>s2;
    cout<<checkInclusion(s1,s2)<<endl;
    return 0;
}
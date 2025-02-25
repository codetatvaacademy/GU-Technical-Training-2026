#include<bits/stdc++.h>
using namespace std;

int numberOfSubstrings(string s) {
    int i=0;
       int n=s.size();
       int j=0;
       int cnt=0;
       int cnt_a=0;
       int cnt_b=0;
       int cnt_c=0; 
       while(j<s.size()){
        if(s[j]=='a')cnt_a++;
        if(s[j]=='b')cnt_b++;
        if(s[j]=='c')cnt_c++;
        while(i<=j&&cnt_a>0&&cnt_b>0&&cnt_c>0){
            if(s[i]=='a')cnt_a--;
        if(s[i]=='b')cnt_b--;
        if(s[i]=='c')cnt_c--;
        i++;
           
        }
 cnt+=j-i+1;
 j++;
       }
       long long r = 1LL * n * (n + 1) / 2;
       return r- cnt;
    }
int main(){
    string s;
    cin>>s;
   
    cout<<numberOfSubstrings(s)<<endl;
    return 0;
   }
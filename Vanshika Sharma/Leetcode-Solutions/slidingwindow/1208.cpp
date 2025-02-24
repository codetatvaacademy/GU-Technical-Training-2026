#include<bits/stdc++.h>
using namespace std;
int equalSubstring(string s, string t, int maxCost) {
    int i=0;
    int j=0;
    int cost=0;
    int maxlen=0;
    while(j<s.size()){
        cost+=abs(s[j]-t[j]);
        while(i<s.size()&&cost>maxCost){
            cost-=abs(s[i]-t[i]);
            i++;
        }
        if(cost<=maxCost){
            maxlen=max(maxlen,j-i+1);
        }
        j++;
    }
    return maxlen;
}
int main(){
    string s,t;
    cin>>s;
    cin>>t;
    int maxCost;
    cin>>maxCost;
    cout<<equalSubstring(s,t,maxCost)<<endl;
    return 0;
}
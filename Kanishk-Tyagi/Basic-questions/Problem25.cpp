// WAP to convert a character into its toggle case.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    char convertTotoggle(char ch){
        if(islower(ch)){
            return isupper(ch);
        }
        if(isupper(ch)){
            return islower(ch);
        }
    }
};
int main(){
    char ch;
    cin >> ch;
    solution sol;
    cout << sol.convertTotoggle(ch);
    return 0;
}
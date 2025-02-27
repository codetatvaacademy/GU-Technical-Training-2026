// WAP to input a character from user and check whether it is uppercase and lowercase.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void checkCasing(char c){
          if(isupper(c)){
              cout << "UpperCase" << endl;
          }
          else if(islower(c)){
              cout << "LowerCase" << endl;
          }
          else{
              cout << "not a valid input" << endl;
          }
    }
};
int main(){
    solution sol;
    char c;
    cin >> c;
    sol.checkCasing(c);
    return 0;
}
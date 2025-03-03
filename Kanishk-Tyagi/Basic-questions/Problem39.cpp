// WAP to input a string from the user and count the number of alphabets, digits & special symbols in the string.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void countInputType(string str){
        int integerCount = 0;
        int characterCount = 0;
        int specialCount = 0;
        for (int i = 0; i < str.size();i++){
            if(isalpha(str[i])){
                characterCount++;
            }
            else if(isdigit(str[i])){
                integerCount++;
            }
            else{
                specialCount++;
            }
        }
        cout << integerCount << endl;
        cout << characterCount << endl;
        cout << specialCount << endl;
    }
};
int main(){
    solution sol;
    string str;
    cin >> str;
    sol.countInputType(str);
    return 0;
}
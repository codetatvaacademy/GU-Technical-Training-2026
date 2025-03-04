// WAP to check whether a character given by user is a vowel or consonant.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void checkVowel(char x){
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            cout << "Vowel" << endl;
        }
        else{
            cout << "Consonant" << endl;
        }
    }
};
int main(){
    solution sol;
    char a;
    cin >> a;
    sol.checkVowel(a);
    return 0;
}
// WAP to convert a string into PIGLATIN form.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    string Pilglatin(string str){
        string vowels = "AEIOUaeiou";
        if(vowels.find(str[0])!=string::npos)
            return str + "way";
        else{
            int i = 0;
            while (i < str.length() && vowels.find(str[i]) == string::npos)
                i++;
            return str.substr(i) + str.substr(0, i) + "ay";
        }
        }
};

int main(){
    string str;
    cin >> str;
    solution sol;
    cout<<sol.Pilglatin(str);
}
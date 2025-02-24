//22. WAP to input a character from user and check whether it is an alphabets, digits, or special symbols.

#include<iostream>
using namespace std;

void checkCharacter(char userInput){
    int asciiToDecimal = static_cast<int>(userInput);
    if(asciiToDecimal >= 48 && asciiToDecimal <= 57){
        cout<<"Input is a { Number }";
        return;
    }
    if(asciiToDecimal >= 65 && asciiToDecimal <= 90){
        cout<<"Input is a { Capital Alphabet }";
        return;
    }
    if(asciiToDecimal >= 97 && asciiToDecimal <= 122){
        cout<<"Input is a { Small Alphabet }";
        return;
    }
    if(asciiToDecimal >= 127){
        cout<<"Input is a { Special Symbol }";
        return;
    }
    cout<<"Input is a { Symbol }";
    return;
}

int main(){
    char userInput;
    cout<<"Enter the character ->>";
    cin>>userInput;

    checkCharacter(userInput);
}
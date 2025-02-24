//23. WAP to input a character from user and check whether it is uppercase and lowercase.

#include<iostream>
using namespace std;

void checkCharacter(char userInput){
    int asciiToDecimal = static_cast<int>(userInput);

    if(asciiToDecimal >= 65 && asciiToDecimal <= 90){
        cout<<"Input is a { Uppercase Alphabet }";
        return;
    }
    if(asciiToDecimal >= 97 && asciiToDecimal <= 122){
        cout<<"Input is a { Lowercase Alphabet }";
        return;
    }

    cout<<"Input is not a Alphabet";
    return;
}

int main(){
    char userInput;
    cout<<"Enter the character ->>";
    cin>>userInput;

    checkCharacter(userInput);
}
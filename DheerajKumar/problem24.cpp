//24. WAP to check whether a character given by user is a vowel or consonant.

#include<iostream>
using namespace std;

void checkVovel(char userInput){
    if(userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u'
    || userInput == 'A' || userInput == 'E' || userInput == 'I' || userInput == 'O' || userInput == 'U'){

        cout<<"Is a [ VOVEL ]";
        return;
    }
    cout<<"Not a vovel";
}

int main(){
    char userInput;
    cout<<"Enter the character ->>";
    cin>>userInput;

    checkVovel(userInput);
}
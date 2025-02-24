//25. WAP to convert a character into its toggle case.

#include<iostream>
using namespace std;

void toggleChar(char character){
    int mapper = static_cast<char>(character);

    if(mapper > 90){
        mapper = mapper - 32;
        cout<<"The Toggle case = "<<static_cast<char>(mapper);
        return;
    }
    if(mapper < 97){
        mapper = mapper + 32;
        cout<<"The Toggle case = "<<static_cast<char>(mapper);
        return;
    }

    cout<<"Error !";
    return;
}

int main(){
    char userInput;
    cout<<"Enter the character ->>";
    cin>>userInput;

    toggleChar(userInput);
    
}
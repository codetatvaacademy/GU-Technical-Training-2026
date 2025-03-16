#include<iostream>
using namespace std;

void check(char ch){
    ch = tolower(ch); 
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        cout<<"It is a Vowel."<<endl;
    else if(isalpha(ch))
        cout<<"It is a Consonant."<<endl;
    else
        cout<<"It is not an Alphabet."<<endl;
}

int main(){
    char ch;
    cout<<"Enter a character: ";
    cin>>ch;

    check(ch);

    return 0;
}

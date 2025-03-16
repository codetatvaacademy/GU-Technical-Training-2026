#include<iostream>
#include<cctype> 
using namespace std;

char toggle(char ch){
    if(islower(ch))
        return toupper(ch); 
    else if(isupper(ch))
        return tolower(ch); 
    else
        return ch;
}

int main(){
    char ch;
    cout<<"Enter a character: ";
    cin>>ch;

    cout<<"Toggled Case: "<<toggle(ch)<<endl;

    return 0;
}

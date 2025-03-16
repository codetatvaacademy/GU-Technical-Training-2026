#include<iostream>
using namespace std;

void check(char ch){
    if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        cout<<"It is an alphabet."<<endl;
    else if(ch>='0'&&ch<='9')
        cout<<"It is a digit."<<endl;
    else
        cout<<"It is a special symbol."<<endl;
}

int main(){
    char ch;
    cout<<"Enter a character: ";
    cin>>ch;

    check(ch);

    return 0;
}

#include<iostream>
using namespace std;

void check(char ch){
    if(ch>='A'&&ch<='Z'){
        cout<<"It is an uppercase alphabet."<<endl;
    }else if(ch>='a'&& ch<='z') {
        cout<<"It is a lowercase alphabet."<<endl;
    }
    
}

int main(){
    char ch;
    cout<<"Enter a character: ";
    cin>>ch;

    check(ch);

    return 0;
}

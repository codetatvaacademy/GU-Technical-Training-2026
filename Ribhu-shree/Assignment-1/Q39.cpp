#include<iostream>
using namespace std;

void count(string str) {
    int alphabet=0,digit=0,special=0;
    for(auto ch:str){
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            alphabet++;
        }else if(ch>='0'&&ch<='9') {
            digit++;
        }else {
            special++;
        }
    }
    
    cout<<"Alphabets: "<<alphabet<<endl;
    cout<<"Digits: "<<digit<<endl;
    cout<<"Special symbols: "<<special<<endl;
}

int main() {
    string str;
    cout<<"Enter a string: ";
    getline(cin,str);
    
    count(str);
    
    return 0;
}

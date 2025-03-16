#include<iostream>
using namespace std;

void table(int num){
    for(int i=1;i<=10;i++)
        cout<<num<<" x "<<i<<" = "<<num*i<<endl;
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    cout<<"Table of "<<num<<":"<<endl;
    table(num);

    return 0;
}

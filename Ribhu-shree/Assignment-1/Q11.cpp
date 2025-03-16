#include <iostream>
using namespace std;

int main(){
    int a,b;
    cout<<"Enter two numbers:";
    cin>>a>>b;

    if(a>b){
        cout<<a<<" is the largest number."<<endl;
    }
    else if(b>a){
        cout<<b<<" is the largest number."<<endl;
    }
    else{
        cout<<"Both numbers are equal."<<endl;
    }

    return 0;
}

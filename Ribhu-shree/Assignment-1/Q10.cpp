#include <iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter a number:";
    cin>>num;

    if(num>0){
        cout<<num<<" is a Positive number."<<endl;
    }
    else if(num<0){
        cout<<num<<" is a Negative number."<<endl;
    }
    else{
        cout<<"The number is Zero."<<endl;
    }

    return 0;
}

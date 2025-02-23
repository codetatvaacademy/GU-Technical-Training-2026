#include<iostream>
using namespace std;

long factorial(int num){
    if(num<=1){
        return 1;
    }
    return num * factorial(num-1);
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    cout<<"Factorial of "<<num<<" is "<<factorial(num)<<endl;

    return 0;
}

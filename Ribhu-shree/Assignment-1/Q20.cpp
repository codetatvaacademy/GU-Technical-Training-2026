#include<iostream>
using namespace std;

float calculate(float a,float b,char op){
    if(op=='+') return a+b;
    if(op=='-') return a-b;
    if(op=='*') return a*b;
    if(op=='/') {
        if(b!=0)return a/b;
        else return 0;
    } 
    return 0; 
}

int main(){
    float num1,num2;
    char op;
    cout<<"Enter two numbers:";
    cin>>num1>>num2;
    cout<<"Enter operation to perform (+,-,*,/):";
    cin>>op;

    float result = calculate(num1,num2,op);
    cout<<"Result: "<<result<<endl;

    return 0;
}

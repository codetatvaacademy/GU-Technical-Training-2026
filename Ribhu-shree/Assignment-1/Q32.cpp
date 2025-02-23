#include<iostream>
using namespace std;

int reverse(int num){
    int rev=0;
    while(num>0){
        rev=num%10+rev*10; 
        num/=10; 
    }
    return rev;
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    cout<<"Reversed number: "<<reverse(num)<<endl;

    return 0;
}

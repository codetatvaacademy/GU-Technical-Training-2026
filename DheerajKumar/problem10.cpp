//10. WAP to check whether the number is positive, negative or zero.

#include<iostream>
using namespace std;

bool checkNegative(int number){
    if(number < 0){
        return true;
    }
    return false;
}

bool checkPositive(int number){
    if(number > 0){
        return true;
    }
    return false;
}

int main(){

    int number;
    cout<<"Enter number ->>";
    cin>>number;

    if(number == 0){
        cout<<" The number is ZERO";
        return 0;
    }
    if(checkPositive(number)){
        cout<<"The number is POSITIVE";
        return 1;
    }
    if(checkNegative(number)){
        cout<<" The number is NEGATIVE";
        return -1;
    }
}
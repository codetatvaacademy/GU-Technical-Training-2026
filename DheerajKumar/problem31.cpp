//31. WAP to check whether a number is perfect or not.

#include<iostream>
using namespace std;

bool sumDivisor(int number){
    if(number <= 0){
        return 0;
    }
    
    int sum = 0;
    for(int i = 1; i <= number/2; i++){
        if(number % i == 0){
            sum += i; 
        }
    }
    if(sum == number){
        return true;
    }

    return false;
}

int main(){
    int number;
    cout<<"Enter the number -> ";
    cin>> number;

    if(sumDivisor(number)){
        cout<<"The number is PERFECT";

    }else{
        cout<<"The number is NOT PERFECT";
        
    }
}
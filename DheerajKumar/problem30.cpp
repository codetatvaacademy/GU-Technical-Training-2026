//30. WAP to print the sum of the divisors of a number given by user.

#include<iostream>
using namespace std;

int sumDivisor(int number){
    if(number <= 0){
        return 0;
    }
    
    int sum = 0;
    for(int i = 1; i <= number/2; i++){
        if(number % i == 0){
            sum += i; 
        }
    }
    return sum;
}

int main(){

    int number;
    cout<<"Enter the number -> ";
    cin>> number;

    cout<<"The sum of diviosor = "<< sumDivisor(number);
}
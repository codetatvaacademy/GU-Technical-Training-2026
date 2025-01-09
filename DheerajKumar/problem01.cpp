//1. WAP to take input 2 numbers from the user and print the sum of the numbers.

#include<iostream>
using namespace std;

int sumOfNumbers(){
    int num1, num2;
    cout<<"Enter num-1 -> ";
    cin>>num1;
    cout<<"Enter num-2 -> ";
    cin>>num2;

    return num1 + num2;
}

int main(){
    cout<<"The sum is -> "<<sumOfNumbers();
    return 0;
}

//32. WAP to print the reverse of a number given by user.

#include<iostream>
using namespace std;

int reverse(int number){
    if(number <= 0){
        return -1;
    }
    
    int lastDigit = 0, reverseNumber = 0;
    while(number > 0){
        lastDigit = number % 10;
        reverseNumber = (reverseNumber * 10) + lastDigit;
        number = number/10; 
    }

    return reverseNumber;
}

int main(){
    int number;
    cout<<"Enter the number -> ";
    cin>> number;

    cout<<"The reverse number = "<< reverse(number);
}
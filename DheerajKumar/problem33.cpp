//33. WAP to take input a number from the user and check whether it is palindrome.
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

    if(number == reverse(number)){
        cout<<"The number is palindrome";
    }else{
        cout<<"The number is  not a palindrome";
    }
}
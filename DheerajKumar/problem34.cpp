//34. WAP to take input a number from the user and check whether it is armstrong.

#include<iostream>
using namespace std;

int calPower(int number, int power){
    int ans = 1;
    for(int i = 1; i <= power; i++){
        ans = ans * number;
    }
    return ans;
}

bool checkArmstrong(int number){
    if(number <= 0){
        return -1;
    }
    int power = 0, originalNumber = number, lastDigit = 0, sum = 0;
    while(number > 0){
       number = number / 10;
       power += 1;
    }

    number = originalNumber;
    for(int i = 0; i < power; i++){
        lastDigit = originalNumber % 10;
        sum = sum + calPower(lastDigit, power);
        originalNumber = originalNumber / 10;
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

    if(checkArmstrong(number)){
        cout<<"The number is palindrome";
    }else{
        cout<<"The number is  not a palindrome";
    }
}
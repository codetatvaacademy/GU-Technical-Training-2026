//6. WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.

#include<iostream>
using namespace std;

int calSum(int num){
    if(num >= 1000 || num < 100){
        cout << "Number is not 3 digit {100<= n < 1000} !";
        return -1;
    }
    int firstDigit = num/100, thirdDigit = num%10;\
    return firstDigit + thirdDigit;
}
int main(){
    int num;
    cout<<"\nEnetr the number ->> ";
    cin>> num;

    cout<<" \nThe sum of 1st , 3rd digits are ->"<< calSum(num);
    
}
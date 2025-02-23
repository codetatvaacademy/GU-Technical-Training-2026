//11. WAP to take input two numbers from the user and print the largest of them.

#include <iostream>
using namespace std;

int largest(int number1, int number2){
    if(number1 > number2){
        return number1;
    }
    return number2;
}

int main(){
    int number1, number2;
    
    cout<<"Enter 1st number ->";
    cin>>number1;
    cout<<"Enter 2nd numebr ->";
    cin>>number2;

    cout<<"The larger number is -> "<<largest(number1, number2);
}
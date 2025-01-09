//28. WAP to input a number from user and print its factorial.

#include<iostream>
using namespace std;

int factorial(int number){
    int previous = 1, secondPrevios = 1, current = 1;
    for(int i = 2; i <= number; i++){
        current = previous * i;
        previous = current;
    }
    return current;
}

int main(){
    int number;
    cout<<"Enter the number -> ";
    cin>>number;

    cout<<"The factorial is -> "<<factorial(number);
}
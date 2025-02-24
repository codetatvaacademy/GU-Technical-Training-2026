//12. WAP to take input 2 numbers from the user and print their difference.

#include <iostream>
using namespace std;

int diffrence(int number1, int number2){
    return number1 > number2 ? 
        number1 - number2 : number2 - number1;
}

int main(){
    int number1, number2;

    cout<<"Enter 1st number -> ";
    cin>>number1;
    cout<<"Enter 2nd numebr -> ";
    cin>>number2;

    cout<<"The Difference is -> "<<diffrence(number1, number2);
}
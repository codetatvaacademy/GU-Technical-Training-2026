/*13. WAP to take input 3 numbers from the user and print the largest number among them.
using nested if 
using AND operator*/

#include<iostream>
using namespace std;

int largetUsingIf(int number1, int number2, int number3){
    if(number1 > number2){
        if(number1 > number3){
            return number1;
        }
    }
    if(number2 > number1){
        if(number2 > number3){
            return number2;
        }
    }
    if(number3 > number1){
        if(number3 > number2){
            return number3;
        }
    }

    cout<<"\n\nAll numbers are equal !\n\n";
    return number1;
}


int largestUsingAnd(int number1, int number2, int number3){
    if(number1 > number2 && number1 > number3){
        return number1;
    }
    if(number2 > number1 && number2 > number3){
        return number2;
    }
    if(number3 > number1 && number3 > number2){
        return number3;
    }

    cout<<"\n\nAll numbers are equal !\n\n";
    return number1;
}

int main(){

    int number1, number2, number3;

    cout<<"\n\nEnter 1st number -> ";
    cin>>number1;
    cout<<"Enter 2nd numebr -> ";
    cin>>number2;
    cout<<"Enter 3nd numebr -> ";
    cin>>number3;

    cout<<"\n\nThe Difference while using nested if -> "<<largetUsingIf(number1, number2, number3);
    cout<<"\nThe Difference while using (And) operator -> "<<largestUsingAnd(number1, number2, number3);
}

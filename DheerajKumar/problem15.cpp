// WAP to take input 3 numbers and print the 2nd largest number among them.

#include <iostream>
using namespace std;

int secondlargest(int number1, int number2, int number3){
    
    int largest = max(number1, max(number2, number3));
    int smallest = min(number1, min(number2, number3));
    
    return (number1 + number2 + number3) - smallest - largest;
}

int main(){
    int number1, number2, number3;

    cout<<"\n\nEnter 1st number -> ";
    cin>>number1;
    cout<<"Enter 2nd numebr -> ";
    cin>>number2;
    cout<<"Enter 3nd numebr -> ";
    cin>>number3;

    cout<<"\n\n2nd Largest number -> "<< secondlargest(number1, number2, number3);
}

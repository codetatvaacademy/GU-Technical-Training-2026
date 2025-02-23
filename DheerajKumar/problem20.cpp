//20. WAP to perform arithmetic operations as per user's choice.


#include <iostream>
using namespace std;

int arithmeticOperation(int number1, int number2, char operation){
    switch (operation)
    {
    case '+':
        return number1 + number2;
    case '-':
        return max(number1, number2) - min(number1, number2);
    case '*':
        return number1 * number2;
    case '/':
        return max(number1, number2) / min(number1, number2);
    
    default:
        cout<< "Operaton dont exist !";
    }
    return 0;
}

int main(){
    int number1, number2;
    char operation;

    cout<<"Enter number 1 -> ";
    cin>>number1;
    cout<<"Operation -> ";
    cin>>operation;
    cout<<"Enter number 2 -> ";
    cin>>number2;

    cout<< "After operation -> "<<arithmeticOperation(number1, number2, operation);
}
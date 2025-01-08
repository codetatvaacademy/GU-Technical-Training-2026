

// 20. WAP to perform arithmetic operations as per user's choice.

#include <iostream>
using namespace std;

int main() {
    int a, b, choice;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    cout << "Choose an operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n";
    cin >> choice;

    switch (choice) {
    case 1:
        cout<< "Sum: "<< (a + b)<< endl;
        break;
    case 2:
        cout<< "Difference: "<< (a - b)<< endl;
        break;
    case 3:
        cout<< "Product: "<< (a * b)<< endl;
        break;
    case 4:
        if(b != 0)
            cout<< "Quotient: "<< (a / b)<< endl;
        else
            cout<< "Division by zero is not allowed."<< endl;
        break;

    default:
        cout << "Invalid choice."<< endl;
    }

}


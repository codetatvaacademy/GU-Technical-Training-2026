

// 12. WAP to take input 2 numbers from the user and print their difference.

#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    cout << "Difference: " << abs(num1 - num2) << endl;
}
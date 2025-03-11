// 11. WAP to take input two numbers from the user and print the largest of them.

#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    if (num1 > num2)
        cout << num1 << " is larger." << endl;
    else if (num2 > num1)
        cout << num2 << " is larger." << endl;
    else
        cout << "Both numbers are equal." << endl;

}

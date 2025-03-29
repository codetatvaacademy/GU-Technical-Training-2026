

// 8. WAP to take input a 4-digit number and print its digits.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 4-digit number: ";
    cin >> num;

    cout << "Digits: " << num / 1000 << ", " << (num / 100) % 10 << ", "
         << (num / 10) % 10 << ", " << num % 10 << endl;

    return 0;
}
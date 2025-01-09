

// 6. WAP to take input a 3-digit number from the user and print the sum of the 1st and 3rd digits.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 3-digit number: ";
    cin >> num;

    int firstDigit = num / 100;
    int lastDigit = num % 10;

    cout << "Sum of 1st and 3rd digits: " << (firstDigit + lastDigit) << endl;
    return 0;
}


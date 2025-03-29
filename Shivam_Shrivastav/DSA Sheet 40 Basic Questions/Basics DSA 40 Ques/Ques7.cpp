
// 7. WAP to take input a 3-digit number and print the square of the middle digit.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 3-digit number: ";
    cin >> num;

    int middleDigit = (num / 10) % 10;
    cout << "Square of the middle digit: " << (middleDigit * middleDigit) << endl;
    return 0;
}

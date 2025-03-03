//WAP to take input 3 digit numbers from the user and print the square of the middle digit.
#include <iostream>
using namespace std;

int squareMiddleDigit(int num) {
    int middle = (num / 10) % 10;
    return middle * middle;
}

int main() {
    int num;
    cin >> num;
    cout << "Square of middle digit: " << squareMiddleDigit(num) << endl;
    return 0;
}

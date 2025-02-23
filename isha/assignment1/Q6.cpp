//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
#include <iostream>
using namespace std;

int sumFirstAndLast(int num) {
    int first = num / 100;
    int last = num % 10;
    return first + last;
}

int main() {
    int num;
    cin >> num;
    cout << "Sum of first and last digit: " << sumFirstAndLast(num) << endl;
    return 0;
}


#include <iostream>
using namespace std;

int main() {
    int num, first, last, sum;

    cout << "Enter a three-digit number: ";
    cin >> num;

    last = num % 10;
    first = num / 100;

    sum = first + last;
    cout << "Sum of the first and last digit is " << sum << endl;

    return 0;
}

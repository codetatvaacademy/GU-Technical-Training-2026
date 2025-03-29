


// 15. WAP to take input 3 numbers and print the 2nd largest number among them.

#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    if ((a > b && a < c) || (a > c && a < b))
        cout << a << " is the second largest." << endl;
    else if ((b > a && b < c) || (b > c && b < a))
        cout << b << " is the second largest." << endl;
    else
        cout << c << " is the second largest." << endl;

}
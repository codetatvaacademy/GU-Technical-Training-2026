#include <iostream>
using namespace std;

int main() {
    int num,square;
    int middle;
    cout << "Enter a three-digit number: ";
    cin >> num;

    num=num/10;
    middle = num%10;

    square = middle*middle;
    cout << "Square of the middle digit is " << square << endl;

    return 0;
}

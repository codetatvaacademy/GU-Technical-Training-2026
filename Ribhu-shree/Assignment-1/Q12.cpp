#include <iostream>
using namespace std;


int diff(int a, int b) {
    return a - b;
}

int main() {
    int num1, num2;

    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    int result = diff(num1, num2);
    cout << "The difference of " << num1 << " and " << num2 << " is: " << result << endl;

    return 0;
}
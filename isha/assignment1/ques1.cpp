//WAP to take input 2 numbers from the user and print the sum of the numbers.

#include <iostream>
using namespace std;

int main() {
    int num1, num2, sum;
    
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;
    
    sum = num1 + num2;
    
    cout << "Sum: " << sum << endl;

    return 0;
}

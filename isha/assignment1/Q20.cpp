#include <iostream>
using namespace std;

void arithmeticOperations() {
    int a, b, choice;
    cin >> a >> b >> choice;
    switch (choice) {
        case 1: cout << "Sum: " << a + b; break;
        case 2: cout << "Difference: " << a - b; break;
        case 3: cout << "Product: " << a * b; break;
        case 4: cout << "Quotient: " << (b != 0 ? a / b : 0); break;
        default: cout << "Invalid choice"; break;
    }
}

int main() {
    arithmeticOperations();
    return 0;
}

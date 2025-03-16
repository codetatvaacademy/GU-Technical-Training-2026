

// 19. WAP to calculate tax based on income.

#include <iostream>
using namespace std;

int main() {
    double income, tax = 0;
    cout << "Enter your income: ";
    cin >> income;

    if (income <= 10000) {
        tax = 0;
    } else if (income <= 25000) {
        tax = 0.1 * (income - 10000);
    } else if (income <= 50000) {
        tax = 2500 + 0.2 * (income - 25000);
    } else {
        tax = 5000 + 0.3 * (income - 50000);
    }

    cout << "Tax to be paid: " << tax << endl;

}

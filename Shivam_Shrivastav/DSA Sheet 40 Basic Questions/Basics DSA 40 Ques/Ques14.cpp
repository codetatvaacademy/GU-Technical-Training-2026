

// 14. WAP to calculate net amount with 15% discount if amount exceeds 2000.

#include <iostream>
using namespace std;

int main() {
    double rate, quantity;
    cout << "Enter rate and quantity: ";
    cin >> rate >> quantity;

    double amount = rate * quantity;
    if (amount > 2000)
        amount -= amount * 0.15;

    cout << "Net amount to be paid: " << amount << endl;

}


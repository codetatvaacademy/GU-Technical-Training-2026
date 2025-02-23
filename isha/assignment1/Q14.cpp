#include <iostream>
using namespace std;

double calculateAmount(double rate, int quantity) {
    double amount = rate * quantity;
    if (amount > 2000) amount -= amount * 0.15;
    return amount;
}

int main() {
    double rate;
    int quantity;
    cin >> rate >> quantity;
    cout << "Net Amount: " << calculateAmount(rate, quantity) << endl;
    return 0;
}

#include <iostream>
using namespace std;

double calculateTax(int income) {
    if (income <= 10000) return 0;
    else if (income <= 25000) return (income - 10000) * 0.1;
    else if (income <= 50000) return 2500 + (income - 25000) * 0.2;
    else return 5000 + (income - 50000) * 0.3;
}

int main() {
    int income;
    cin >> income;
    cout << "Tax: " << calculateTax(income) << endl;
    return 0;
}

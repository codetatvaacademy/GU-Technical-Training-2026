#include <iostream>
using namespace std;

int toPaise(double rs) {
    return rs * 100;  
}

int main() {
    double rs;
    cout << "Enter amount in rupees: ";
    cin >> rs;

    int paise = toPaise(rs);

    cout << rs << " Rupees is equal to " << paise << " Paise." << endl;

    return 0;
}
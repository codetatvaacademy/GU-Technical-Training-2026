
// 4. WAP to take input rupees from the user and convert it into paise.

#include <iostream>
using namespace std;

int main() {
    int rupees;
    cout << "Enter amount in rupees: ";
    cin >> rupees;

    int paise = rupees * 100;
    cout << rupees << " rupees is " << paise << " paise." << endl;
    return 0;
}


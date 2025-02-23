//WAP to take input rupees from the user and convert it into paise.
#include <iostream>
using namespace std;

int convertToPaise(int rupees) {
    return rupees * 100;
}

int main() {
    int rupees;
    cin >> rupees;
    cout << "Paise: " << convertToPaise(rupees) << endl;
    return 0;
}

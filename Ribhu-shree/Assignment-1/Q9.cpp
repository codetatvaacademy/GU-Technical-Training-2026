#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "enter  number: ";
    cin >> num;
    if (num % 2 == 0) {
        cout << num << " is an Even number." << endl;
    } else {
        cout << num << " is an Odd number." << endl;
    }

    return 0;
}


#include <iostream>
using namespace std;

int main() {
    int lowerLimit, upperLimit;
    cout << "Enter the lower limit: ";
    cin >> lowerLimit;
    cout << "Enter the upper limit: ";
    cin >> upperLimit;

    cout << "Numbers between " << lowerLimit << " and " << upperLimit << ":" << endl;
    for (int i = lowerLimit + 1; i < upperLimit; i++) {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}

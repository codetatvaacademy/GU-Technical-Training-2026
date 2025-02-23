#include <iostream>
using namespace std;

int difference(int a, int b) {
    return abs(a - b);
}

int main() {
    int a, b;
    cin >> a >> b;
    cout << "Difference: " << difference(a, b) << endl;
    return 0;
}

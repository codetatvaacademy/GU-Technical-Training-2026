#include <iostream>
#include <cmath>
using namespace std;

void series6(int n) {
    for (int i = 0; i < n; i++) {
        cout << (pow(2, i) - 1) << " ";
    }
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;
    series6(n);
    return 0;
}

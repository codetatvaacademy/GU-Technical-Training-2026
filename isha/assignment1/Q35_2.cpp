#include <iostream>
using namespace std;

void series2(int n) {
    int term = 0;
    for (int i = 1; i <= n; i++) {
        term = term * 10 + 1;
        cout << term << " ";
    }
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;
    series2(n);
    return 0;
}

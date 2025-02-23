#include <iostream>
using namespace std;

void series1(int n) {
    int term = 0;
    for (int i = 1; i <= n; i++) {
        term += i;
        cout << term << " ";
    }
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;
    series1(n);
    return 0;
}

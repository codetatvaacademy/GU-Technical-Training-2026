#include <iostream>
using namespace std;

void series3(int n) {
    int term = 0;
    for (int i = 1; i <= n; i++) {
        term = term * 10 + i;
        cout << term << " ";
    }
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;
    series3(n);
    return 0;
}

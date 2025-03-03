#include <iostream>
#include <cmath>
using namespace std;

void series7(int x, int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        int term = pow(x, i) * (i % 2 == 0 ? -1 : 1);
        sum += term;
        cout << term << " ";
    }
    cout << "\nSum of series: " << sum << endl;
}

int main() {
    int x, n;
    cout << "Enter value of x: ";
    cin >> x;
    cout << "Enter number of terms: ";
    cin >> n;
    series7(x, n);
    return 0;
}

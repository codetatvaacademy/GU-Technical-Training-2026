#include <iostream>
using namespace std;

void fibonacci(int n) {
    int a = 0, b = 1, c;
    cout << a << " " << b << " ";
    for (int i = 2; i < n; i++) {
        c = a + b;
        cout << c << " ";
        a = b;
        b = c;
    }
}

int main() {
    int n;
    cout << "Enter number of terms: ";
    cin >> n;
    fibonacci(n);
    return 0;
}

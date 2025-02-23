#include <iostream>
using namespace std;

void largest(int a, int b, int c) {
    if (a > b) {
        if (a > c) cout << "Largest: " << a << endl;
        else cout << "Largest: " << c << endl;
    } else {
        if (b > c) cout << "Largest: " << b << endl;
        else cout << "Largest: " << c << endl;
    }
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    largest(a, b, c);
    return 0;
}

#include <iostream>
using namespace std;

void printDescending(int a, int b, int c) {
    if (a < b) swap(a, b);
    if (a < c) swap(a, c);
    if (b < c) swap(b, c);
    cout << a << " " << b << " " << c << endl;
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    printDescending(a, b, c);
    return 0;
}

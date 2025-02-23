#include <iostream>
using namespace std;

void secondLargest(int a, int b, int c) {
    if ((a > b && a < c) || (a > c && a < b)) cout << "Second Largest: " << a << endl;
    else if ((b > a && b < c) || (b > c && b < a)) cout << "Second Largest: " << b << endl;
    else cout << "Second Largest: " << c << endl;
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    secondLargest(a, b, c);
    return 0;
}

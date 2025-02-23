//WAP to take input two numbers from the user and print the largest of them.
#include <iostream>
using namespace std;

void findLargest(int a, int b) {
    if (a > b)
        cout << "Largest: " << a << endl;
    else
        cout << "Largest: " << b << endl;
}

int main() {
    int a, b;
    cin >> a >> b;
    findLargest(a, b);
    return 0;
}

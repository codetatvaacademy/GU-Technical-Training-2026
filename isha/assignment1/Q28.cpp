#include <iostream>
using namespace std;

void printEvenNumbers(int low, int high) {
    for (int i = low; i <= high; i++)
        if (i % 2 == 0) cout << i << " ";
}

int main() {
    int low, high;
    cin >> low >> high;
    printEvenNumbers(low, high);
    return 0;
}

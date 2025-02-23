#include <iostream>
using namespace std;

void printNumbers(int low, int high) {
    for (int i = low; i <= high; i++) cout << i << " ";
}

int main() {
    int low, high;
    cin >> low >> high;
    printNumbers(low, high);
    return 0;
}

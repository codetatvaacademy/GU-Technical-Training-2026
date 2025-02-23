//WAP to take input 4 digit numbers from the user and print its all digits.
#include <iostream>
using namespace std;

void printDigits(int num) {
    cout << "Digits: " << num / 1000 << " " << (num / 100) % 10 << " " << (num / 10) % 10 << " " << num % 10 << endl;
}

int main() {
    int num;
    cin >> num;
    printDigits(num);
    return 0;
}

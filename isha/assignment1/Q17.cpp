#include <iostream>
using namespace std;

bool isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

int main() {
    int year;
    cin >> year;
    cout << (isLeapYear(year) ? "Leap Year" : "Not a Leap Year") << endl;
    return 0;
}

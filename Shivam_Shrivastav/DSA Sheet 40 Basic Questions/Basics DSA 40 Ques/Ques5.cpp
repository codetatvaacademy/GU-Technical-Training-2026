
// 5. WAP to take input days from the user and convert it into years, months, and remaining days.

#include <iostream>
using namespace std;

int main() {
    int days;
    cout << "Enter the number of days: ";
    cin >> days;

    int years = days / 365;
    int months = (days % 365) / 30;
    int remainingDays = (days % 365) % 30;

    cout << years << " years, " << months << " months, " << remainingDays << " days" << endl;
    return 0;
}
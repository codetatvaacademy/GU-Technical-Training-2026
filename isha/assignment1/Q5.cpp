//WAP to take input days from the user and convert it into years, months, and remaining days.
#include <iostream>
using namespace std;

void convertDays(int days) {
    int years = days / 365;
    int months = (days % 365) / 30;
    int remainingDays = (days % 365) % 30;
    cout << "Years: " << years << ", Months: " << months << ", Days: " << remainingDays << endl;
}

int main() {
    int days;
    cin >> days;
    convertDays(days);
    return 0;
}

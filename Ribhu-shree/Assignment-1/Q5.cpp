#include <iostream>
using namespace std;
void convert(int Days) {
    int years = Days / 365;            
    int remainingDays = Days % 365;    
    int months = remainingDays / 30;       
    remainingDays = remainingDays % 30;     

    cout << Days << " days is approximately: " << endl;
    cout << years << " year's, " << months << " month's, and " << remainingDays << " day's." << endl;
}

int main() {
    int days;
    cout << "Enter the number of days: ";
    cin >> days;
    convert(days);

    return 0;
}

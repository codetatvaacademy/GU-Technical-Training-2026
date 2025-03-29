// WAP to take input days from the user and convert it into years, months, and remaining days.
#include<iostream>
using namespace std;
class solution{
    public:
    void daystoCalendar(int days){
        int years = days / 365;
        int months = (days % 365) / 30;
        int remainingDay= (days%365)%30;
        cout << years << "years" << endl;
        cout << months << "months" << endl;
        cout << remainingDay << "Days" << endl;
    }
};
int main(){
    int days;
    cin >> days;
    solution sol;
    
    sol.daystoCalendar(days);
}
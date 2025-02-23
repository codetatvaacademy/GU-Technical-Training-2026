//5. WAP to take input days from the user and convert it into years, months, and remaining days.

#include<iostream>
using namespace std;

int years(int days){
    if(days > 366){
        return days/365;
    }
    return 0;
}

int months(int days){
    int remaningDays = days % 365;

    if(remaningDays > 31){
       return remaningDays / 31;
    }
    return 0;
}

int noOfDays(int days){
    int remaningDay = days % 365;
    remaningDay = remaningDay % 30; 
    return remaningDay - 2*(years(days)%4);
}

int main(){
    int days;
    cout<<"Enter no. of days ->>";
    cin>>days;
    
    cout<<"\n\nYears -> "<<years(days)<<"\n  months -> "<<
        months(days)<<"\n    days -> "<<noOfDays(days);
}
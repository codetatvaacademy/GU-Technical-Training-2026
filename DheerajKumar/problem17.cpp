//17. WAP to input year from user and check whether it is a leap year or not.

#include<iostream>
using namespace std;

void checkLeep(int year){
    if(year % 100 == 0){
        if(year % 400 == 0){
            cout<<year<<" year is a leep year";
            return;
        }
        cout<<year<<" year is Not a leep year";
        return;
    }
    if(year % 4 == 0){
        cout<<year<<" Year is a leep year";
        return;
    }
    cout<<year<<"Year not a leep year";
    return;
}

int main(){
    int year;
    cout<<"Enter the year -> ";
    cin>>year;

    checkLeep(year);
}
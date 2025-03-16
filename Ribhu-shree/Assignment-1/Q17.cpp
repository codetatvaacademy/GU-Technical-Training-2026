#include<iostream>
using namespace std;
bool isLeapyear(int n) {
    if (n%4==0) {
       if (n%100==0) {
          return n%400 == 0;
       }
       return true;
    }
    return false;
 }

int main(){
    int year;
    cout<<"Enter a year:";
    cin>>year;

    if(isLeapyear(year)){
        cout<<year<<" is a Leap Year."<<endl;
    }else {
        cout<<year<<" is not a Leap Year."<<endl;
    }

    return 0;
}
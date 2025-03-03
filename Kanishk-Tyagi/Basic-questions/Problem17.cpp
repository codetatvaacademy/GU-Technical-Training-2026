// WAP to input year from user and check whether it is a leap year or not.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    bool leap_year(int year){
      if(year%400==0){
          return true;
      }
      else if(year%100==0){
          return false;
      }
      else if(year%4==0){
          return true;
      }
      else{
          return false;
      }
    }
};
int main(){
    int year;
    cin >> year;
    solution sol;
    if(sol.leap_year(year)){
        cout << "Leap Year" << endl;
    }
    else {
        cout << "Not a Leap Year" << endl;
    }
    return 0;
}
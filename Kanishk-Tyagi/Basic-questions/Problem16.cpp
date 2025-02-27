// WAP to take input a number (range 1 to 7) from the user and print the corresponding week.
#include<iostream>
using namespace std;
class solution{
    public:
    void DaysofWeek(int n){
      switch (n)
      {
      case 1:
          cout << "Monday" << endl;
          break;
      case 2:
          cout << "Tuesday" << endl;
          break;
      
      case 3:
          cout << "Wednesday" << endl;
          break;
      case 4:
          cout << "Thursday" << endl;
          break;
      case 5:
          cout << "Friday" << endl;
          break;
      case 6:
          cout << "Saturday" << endl;
          break;
      case 7:
          cout << "Sunday" << endl;
          break;
      }
    }
};
int main(){
    int x;
    cin >> x;
    solution sol;
    if(x<1 || x>7){
        cout << "Invalid Input" << endl;
    }
    else{
        sol.DaysofWeek(x);
    }
    return 0;
}
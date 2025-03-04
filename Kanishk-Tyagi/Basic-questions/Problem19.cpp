// WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
#include<bits/stdc++.h>
using namespace std;

class solution{
    public:
    double calculateTax(int income){
       if(income<=10000){
           return 0;
       }
       else if(income>10000 && income<=25000){
           return 0.1 * (income - 10000);
       }
       else if(income>25000 && income<=50000){
           return 2500 + (0.2 * (income - 25000));
       }
       else{
           return 5000 + (0.3 * (income - 50000));
       }
    }
};
int main(){
    int income;
    cin >> income;
    solution sol;
    double result=sol.calculateTax(income);
    cout << result;
    return 0;
}
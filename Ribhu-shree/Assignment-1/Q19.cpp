#include<iostream>
using namespace std;

float tax_amount(float income){
    if(income<=10000) return 0;
    else if(income<=25000) return (income-10000)*0.10;
    else if(income<=50000) return 2500+(income-25000)*0.20;
    else return 5000+(income-50000)*0.30;
}

int main(){
    float income;
    cout<<"Enter your income:";
    cin>>income;

    float tax = tax_amount(income);
    cout<<"Tax to be paid: "<<tax<<endl;

    return 0;
}

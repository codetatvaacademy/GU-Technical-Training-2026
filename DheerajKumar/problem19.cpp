/*19. WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
Less or equal to 10,000 -> no tax
Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
Greater than 50,000 -> 5000 + 30% of income above 50,000*/

#include<iostream>
using namespace std;

float calTax(float incomeAmount){
    if(incomeAmount <= 10000){
        return 0;
    }
    if(incomeAmount > 10000 && incomeAmount <= 25000){
        return incomeAmount * (10.0 / 100);
    }
    if(incomeAmount > 25000 && incomeAmount <= 50000){
        return 2500 + (incomeAmount * (25.0 / 100));
    }
    if(incomeAmount > 50000){
        return 5000 + (incomeAmount * (30.0 / 100));
    }
    cout<<"Error !";
    return -1;
}

int main(){
    float incomeAmount;
    cout<<"\nEnter the incomeamount -> ";
    cin>>incomeAmount;

    cout<<"\nThe tax is -- "<< calTax(incomeAmount)<<" /- ";
}
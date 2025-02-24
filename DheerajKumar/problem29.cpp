//29. WAP to input a number from user and print its table.

#include<iostream>
using namespace std;

void tableOfNumber(int number){
    if(number <= 0){
        return;
    }
    for(int i = 1; i <= 10; i++){
        cout<<number<<" x "<<i<<" = "<<number * i<<"\n";
    }
    return;
}

int main(){
    int number;
    cout<<"Enter the number ->> ";
    cin>>number;

    cout<<"\n";
    tableOfNumber(number);
}

//26. WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.

#include<iostream>
using namespace std;

void printNumebers(int lowerLimit, int upperLimit){
    cout<<"[ - ";
    for(int i = lowerLimit + 1; i < upperLimit; i++){
        cout<<i<<" - ";
    }
    cout<<" ]";
}

int main(){
    int lowerLimit, upperLimit;
    cout<<"Enter lower case ->> ";
    cin>>lowerLimit;
    cout<<"Enter upper case ->> ";
    cin>>upperLimit;

    printNumebers(lowerLimit, upperLimit);
}
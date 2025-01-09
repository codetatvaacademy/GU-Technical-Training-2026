//27. WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.

#include<iostream>
using namespace std;

void printNumebers(int lowerLimit, int upperLimit){
    cout<<"[ - ";
    for(int i = lowerLimit + 1; i < upperLimit; i++){
        if(i % 2 == 0){
            cout<<i<<" - ";
        }
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
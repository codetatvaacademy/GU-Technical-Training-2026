//7. WAP to take input 3 digit numbers from the user and print the square of the middle digit.


#include<iostream>
using namespace std;

int middleSquare(int number){
    if(number >= 1000 || number < 100){
        cout<<"out of range !";
        return -1;
    }
    int middle = (number%100)/10;
    return middle * middle;
}

int main(){
    int number;
    cout<< "\n\nEnter the number ->>";
    cin>> number;

    cout<< "\n\n Square of the middle number is -> "<< middleSquare(number);
}
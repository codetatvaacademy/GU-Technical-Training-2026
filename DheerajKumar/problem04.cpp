//4. WAP to take input rupees from the user and convert it into paise.

#include<iostream>
using namespace std;

float inPaise(float rupees){
    return 100*rupees;
}

int main(){
    float rupees;
    cout<<"Enter the amount in rupees -> ";
    cin>> rupees;
    cout<<"\nAmount in paise is -> "<< inPaise(rupees);
}
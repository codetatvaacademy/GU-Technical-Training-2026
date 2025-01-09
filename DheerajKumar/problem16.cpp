/*16. WAP to take input a number (range 1 to 7) from the user and print the corresponding week day.
using if else 
using switch */

#include<iostream>
using namespace std;

void weekDayUsingIf(int num){
    if(num == 1){
        cout<<"-- Sunday --";
        return;
    }
    if(num == 2){
        cout<<"-- Monday --";
        return;
    }
    if(num == 3){
        cout<<"-- Thusday --";
        return;
    }
    if(num == 4){
        cout<<"-- Wednessday --";
        return;
    }
    if(num == 5){
        cout<<"-- Thursday --";
        return;
    }
    if(num == 6){
        cout<<"-- Friday --";
        return;
    }
    if(num == 7){
        cout<<"-- Saturday --";
        return;
    }

    cout<<"Out of range Input";
    return;
}


void weekDayUsingSwitch(int number){
    switch (number)
    {
    case 1:
        cout<<"-- Sunday --";
        return;
    case 2:
        cout<<" -- Monday --";
        return;
    case 3:
        cout<<"-- Thuesday --";
        return;
    case 4:
        cout<<"-- Wednessday --";
        return;
    case 5:
        cout<<"-- Thrusday --";
        return;
    case 6:
        cout<<"-- Friday --";
        return;
    case 7:
        cout<<"-- Saturday --";
        return;

    default:
        cout<<"Out of range Input ";
        return;
    }
}


int main(){
    int numberOfDay;
    cout<<"\n\nEnter the number -> ";
    cin>>numberOfDay;

    cout<<"\nThe day corresponding # ";
    weekDayUsingIf(numberOfDay);

    cout<<"\nThe day corresponding # ";
    weekDayUsingSwitch(numberOfDay);
}
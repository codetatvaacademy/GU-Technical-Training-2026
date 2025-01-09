/*35. WAP to take input a number from user and print in the form of series:
1, 3, 6, 10, 15, ... nth term
1, 11, 111, 1111, ... nth term
1, 12, 123, 1234, … nth term
0, 7, 26, 63, … nth term
0, 1, 1, 2, 3, 5, 8, … nth term
0, 1, 3, 7, 15, … nth term
x - x ^ 2 + x ^ 3 - x ^ 4 + x ^ 5 … nth term (do sum here also)*/

#include<iostream>
#include<cmath>
using namespace std;

void series1(int number){
    cout << "\nThe series is: ";
    int nthTerm = 0, iterator = 1;
    
    for(int i = 0; i < number; i++){
        nthTerm = nthTerm + iterator;
        cout<<nthTerm<<", ";
        iterator++;
    }
}

void series2(int number){
    cout << "\nThe series is: ";
    cout<<"\n";

    for(int i = 0; i < number; i++){
        for(int j = 0; j <= i; j++){
            cout<<"1";
        }
        cout<<", ";
    }
}

void series3(int number){
    cout << "\nThe series is: ";
    cout<<"\n";

    for(int i = 1; i <= number; i++){
        for(int j = 1; j <= i; j++){
            cout<<j;
        }
        cout<<", ";
    }
}

int cube(int integer){
    return integer * integer * integer;
}

void series4(int number){
    cout << "\nThe series is: ";

    cout<<"\n";
    for(int i = 1; i < number; i++){
        cout<<cube(i) - 1<<", ";
    }
}

void series5(int number){
    cout << "\nThe series is: ";
    int firstPrevious = 0, secondPrevious = 1, current = 0;
    if(number >= 1){
        cout<<"\n "<<firstPrevious<<", ";
    }
    if(number >= 2){
        cout<<secondPrevious<<", ";
    }

    for(int i = 3; i <= number; i++){
        current = firstPrevious + secondPrevious;
        cout<<current<<", ";
        firstPrevious = secondPrevious;
        secondPrevious = current;
    } 
}


void series6(int number){
    cout << "\nThe series is: ";
    if(number == 1){
        cout<<"0 ,";
        return;
    }

    cout<<"0 ,";
    int powerOfTwo = 1;
    for(int i = 1; i < number; i++){
        powerOfTwo = powerOfTwo * 2;
        cout<<powerOfTwo - 1<<", ";
    }
}

void series7(int x, int n) {
    double sum = 0;

    cout << "\nThe series is: ";
    for (int i = 1; i <= n; i++) {
        double term = pow(x, i);
        if (i % 2 == 0) {
            cout << " - " << term;
            sum -= term;
        } else {
            if (i == 1)
                cout << term; 
            else
                cout << " + " << term;
            sum += term;
        }
    }
    cout << " = " << sum << endl;
}

int main(){
    int number;
    cout<<"Enter the number -> ";
    cin>> number;

    series1(number);
    series2(number);
    series3(number);
    series4(number);
    series5(number);
    series6(number);

    int inputX;
    cout<<"\n Enter the number -> ";
    cin>> inputX;

    series7(inputX, number);

}
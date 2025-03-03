
// Problem Title
// Define a class called ParkingLot with the following description :-

// 1. Instance variables :-
// 1. int vehicleNumber - to store vehicle number.
// 2. double hours - to storee the number of hours the vehicle is parked.
// 3. double bill - to store the bill amount.
// 2. Member methods :-
// 1. ParkingLot - to initialise data members.
// 2. void input() - to input and store the vehicleNumber and hours.
// 3. void calculate() - to compute the parking charge at rate of 3 rs for the first hour or part thereof and 1.5 rs for each additional hour.
// 4. void display() - to display details.
// 3. Write a main() method to create an object of the class and call the above methods.
#include <bits/stdc++.h>
using namespace std;

class ParkingLot{
private:
    int vehicleNumber;
    double hours;
    double bill;
public:
    ParkingLot() : vehicleNumber(0), hours(0.0), bill(0.0) {}
    void input(){
           cin >> vehicleNumber >> hours;
    }

    void calculate(){
    
        bill = 3.0 + max(0.0, (hours - 1)) * 1.5;
    }
    void display(){
        cout << "Vehicle Number: " << vehicleNumber<<endl;
        cout << "Hours Parked: " << hours << endl;
        cout << "Parking Charge: Rs " << bill<<endl;
    }
};

int main()
{
    ParkingLot obj;
    obj.input();
    obj.calculate();
    obj.display();
    return 0;
}

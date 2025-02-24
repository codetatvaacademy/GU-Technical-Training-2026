#include<iostream>
using namespace std;

class ParkingLot {
    int vehicleNumber;
    double hours, bill;

public:
    ParkingLot() {
        vehicleNumber = 0;
        hours = 0.0;
        bill = 0.0;
    }

    void input() {
        cout<<"Enter Vehicle Number: ";
        cin>>vehicleNumber;
        cout<<"Enter Hours Parked: ";
        cin>>hours;
    }

    void calculate() {
        if(hours <= 1) {
            bill = 3.0; 
        } else {
            bill = 3.0 + (hours - 1) * 1.5;
        }
    }

    void display() {
        cout<<"\nParking Details\n";
        cout<<"Vehicle Number: "<<vehicleNumber<<endl;
        cout<<"Hours Parked: "<<hours<<endl;
        cout<<"Total Bill: ₹"<<bill<<endl;
    }
};

int main() {
    ParkingLot p;
    p.input();
    p.calculate();
    p.display();
    return 0;
}

#include <iostream>
using namespace std;

class ParkingLot {
private:
    int vehicleNumber;
    double hours, bill;

public:
    ParkingLot() : vehicleNumber(0), hours(0), bill(0) {}

    void input() {
        cout << "Enter vehicle number: ";
        cin >> vehicleNumber;
        cout << "Enter number of hours parked: ";
        cin >> hours;
    }

    void calculate() {
        bill = 3.0 + (hours > 1 ? (hours - 1) * 1.5 : 0);
    }

    void display() {
        cout << "\nVehicle Number: " << vehicleNumber << "\nHours Parked: " << hours << "\nBill Amount: Rs. " << bill << endl;
    }
};

int main() {
    ParkingLot car;
    car.input();
    car.calculate();
    car.display();
    return 0;
}

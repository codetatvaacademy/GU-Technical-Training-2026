#include <iostream>
#include <iomanip> 
using namespace std;

class ParkingLot {
    private:
    int vehicleNumber; 
    double hours;      
    double bill;      

public:
    ParkingLot() {
        vehicleNumber = 0;
        hours = 0.0;
        bill = 0.0;
    }
    void input() {
        cout << "Enter vehicle number: ";
        cin >> vehicleNumber;
        cout << "Enter parking hours: ";
        cin >> hours;
    }
    void calculate() {
        if (hours <= 1) {
            bill = 3.0; 
        } else {
            bill = 3.0 + (hours - 1) * 1.5; 
        }
    }
    void display()  {
        cout << "\nParking Details:\n";
        cout << "Vehicle Number: " << vehicleNumber << endl;
        cout << "Parking Hours: " << hours << " hours" << endl;
        cout << fixed << setprecision(2);
        cout << "Bill Amount: Rs. " << bill << endl;
    }
};

int main() {
    ParkingLot park;
    park.input();
    park.calculate();
    park.display();

    return 0;
}
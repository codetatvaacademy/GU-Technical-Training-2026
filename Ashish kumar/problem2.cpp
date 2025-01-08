#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of flights: ";
    cin >> n;

    int row;
    cout << "Enter the number of rows: ";
    cin >> row;

    int column;
    cout << "Enter the number of columns: ";
    cin >> column;

    int bookings[row][column];

    // Input bookings data
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            cout << "Enter element for row " << i << " and column " << j << ": ";
            cin >> bookings[i][j];
        }
    }


    // Initialize the answer array
    int Answer[n] = {0};

    // Process bookings
    for (int i = 0; i < row; i++) {
        int startFlight = bookings[i][0];
        int endFlight = bookings[i][1];
        int seatsBooked = bookings[i][2];

        for (int j = startFlight; j <= endFlight; j++) {
            Answer[j - 1] += seatsBooked; // Assuming 1-based flight index
        }
    }

    // Output the result
    cout << "Seats booked for each flight:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Flight " << (i + 1) << ": " << Answer[i] << endl;
    }

    return 0;
}

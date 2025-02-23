#include <iostream>
using namespace std;

void calculateArea() {
    int choice;
    double area;
    cin >> choice;
    if (choice == 1) {
        double l, b;
        cin >> l >> b;
        area = l * b;
    } else if (choice == 2) {
        double r;
        cin >> r;
        area = 3.14 * r * r;
    } else if (choice == 3) {
        double b, h;
        cin >> b >> h;
        area = 0.5 * b * h;
    } else {
        cout << "Invalid choice";
        return;
    }
    cout << "Area: " << area;
}

int main() {
    calculateArea();
    return 0;
}

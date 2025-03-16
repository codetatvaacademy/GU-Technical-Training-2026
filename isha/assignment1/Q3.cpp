//WAP to calculate and print area of circle and circumference of circle.
#include <iostream>
using namespace std;

const double PI = 3.14159;

double area(double radius) {
    return PI * radius * radius;
}

double circumference(double radius) {
    return 2 * PI * radius;
}

int main() {
    double radius;
    cin >> radius;
    cout << "Area: " << area(radius) << endl;
    cout << "Circumference: " << circumference(radius) << endl;
    return 0;
}

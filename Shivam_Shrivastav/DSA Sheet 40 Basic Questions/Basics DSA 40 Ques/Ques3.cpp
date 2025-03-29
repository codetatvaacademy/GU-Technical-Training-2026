

// 3. WAP to calculate and print area of a circle(pi*r^2) and circumference(2*pi*r) of a circle.

#include <iostream>
#include <cmath>
using namespace std;

int main() {
    const double PI = 3.14159;
    double radius;
    cout << "Enter the radius of the circle: ";
    cin >> radius;

    double area = PI * radius * radius;
    double circumference = 2 * PI * radius;

    cout << "Area: " << area << endl;
    cout << "Circumference: " << circumference << endl;
    return 0;
}

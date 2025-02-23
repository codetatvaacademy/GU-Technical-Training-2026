#include <iostream>
#define PI 3.14159  
using namespace std;

double area(double radius) {
    return PI * radius * radius;
}

double circum(double radius) {
    return 2 * PI * radius;
}

int main() {
    double r;
    cout << "Enter the radius of the circle: ";
    cin >> r;
    double areaa = area(r);
    double circumference = circum(r);

    cout << "Area of the circle: " << areaa << endl;
    cout << "Circumference of the circle: " << circumference << endl;

    return 0;
}

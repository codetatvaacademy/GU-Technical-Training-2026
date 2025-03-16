// 1. WAP to take input 2 numbers from the user and print the sum of the numbers.

#include <iostream>
using namespace std;
int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;
    cout << "The sum of " << num1 << " and " << num2 << " is " << (num1 + num2) << endl;
    return 0;
}







// 2. WAP to take input 1 number from the user and print its square and cube.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;
    cout << "Square of " << num << " is " << (num * num) << endl;
    cout << "Cube of " << num << " is " << (num * num * num) << endl;
    return 0;
}






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







// 4. WAP to take input rupees from the user and convert it into paise.

#include <iostream>
using namespace std;

int main() {
    int rupees;
    cout << "Enter amount in rupees: ";
    cin >> rupees;

    int paise = rupees * 100;
    cout << rupees << " rupees is " << paise << " paise." << endl;
    return 0;
}






// 5. WAP to take input days from the user and convert it into years, months, and remaining days.

#include <iostream>
using namespace std;

int main() {
    int days;
    cout << "Enter the number of days: ";
    cin >> days;

    int years = days / 365;
    int months = (days % 365) / 30;
    int remainingDays = (days % 365) % 30;

    cout << years << " years, " << months << " months, " << remainingDays << " days" << endl;
    return 0;
}







// 6. WAP to take input a 3-digit number from the user and print the sum of the 1st and 3rd digits.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 3-digit number: ";
    cin >> num;

    int firstDigit = num / 100;
    int lastDigit = num % 10;

    cout << "Sum of 1st and 3rd digits: " << (firstDigit + lastDigit) << endl;
    return 0;
}







// 7. WAP to take input a 3-digit number and print the square of the middle digit.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 3-digit number: ";
    cin >> num;

    int middleDigit = (num / 10) % 10;
    cout << "Square of the middle digit: " << (middleDigit * middleDigit) << endl;
    return 0;
}








// 8. WAP to take input a 4-digit number and print its digits.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a 4-digit number: ";
    cin >> num;

    cout << "Digits: " << num / 1000 << ", " << (num / 100) % 10 << ", "
         << (num / 10) % 10 << ", " << num % 10 << endl;

    return 0;
}







// 9. WAP to check whether a number is even or odd.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if (num % 2 == 0)
        cout << num << " is even." << endl;
    else
        cout << num << " is odd." << endl;

    return 0;
}







// 10. WAP to check whether the number is positive, negative, or zero.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if (num > 0)
        cout << "Positive" << endl;
    else if (num < 0)
        cout << "Negative" << endl;
    else
        cout << "Zero" << endl;

    return 0;
}






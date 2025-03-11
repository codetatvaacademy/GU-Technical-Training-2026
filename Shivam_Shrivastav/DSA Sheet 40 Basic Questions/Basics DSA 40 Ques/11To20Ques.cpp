
// 11. WAP to take input two numbers from the user and print the largest of them.

#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    if (num1 > num2)
        cout << num1 << " is larger." << endl;
    else if (num2 > num1)
        cout << num2 << " is larger." << endl;
    else
        cout << "Both numbers are equal." << endl;

}






// 12. WAP to take input 2 numbers from the user and print their difference.

#include <iostream>
using namespace std;

int main() {
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    cout << "Difference: " << abs(num1 - num2) << endl;
}






// 13. WAP to take input 3 numbers from the user and print the largest among them.
// 1-: Using Nested If:


#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    if (a > b) {
        if (a > c)
            cout << a << " is the largest." << endl;
        else
            cout << c << " is the largest." << endl;
    } else {
        if (b > c)
            cout << b << " is the largest." << endl;
        else
            cout << c << " is the largest." << endl;
    }

}




// 2-: Using AND Operator:


#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    if (a > b && a > c)
        cout << a << " is the largest." << endl;
    else if (b > a && b > c)
        cout << b << " is the largest." << endl;
    else
        cout << c << " is the largest." << endl;

}








// 14. WAP to calculate net amount with 15% discount if amount exceeds 2000.

#include <iostream>
using namespace std;

int main() {
    double rate, quantity;
    cout << "Enter rate and quantity: ";
    cin >> rate >> quantity;

    double amount = rate * quantity;
    if (amount > 2000)
        amount -= amount * 0.15;

    cout << "Net amount to be paid: " << amount << endl;

}







// 15. WAP to take input 3 numbers and print the 2nd largest number among them.

#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    if ((a > b && a < c) || (a > c && a < b))
        cout << a << " is the second largest." << endl;
    else if ((b > a && b < c) || (b > c && b < a))
        cout << b << " is the second largest." << endl;
    else
        cout << c << " is the second largest." << endl;

}








// 16. WAP to input a number (1 to 7) and print the corresponding week day.
// Using If-Else:

#include <iostream>
using namespace std;

int main() {
    int day;
    cout << "Enter a number (1-7): ";
    cin >> day;

    if (day == 1)
        cout << "Monday" << endl;
    else if (day == 2)
        cout << "Tuesday" << endl;
    else if (day == 3)
        cout << "Wednesday" << endl;
    else if (day == 4)
        cout << "Thursday" << endl;
    else if (day == 5)
        cout << "Friday" << endl;
    else if (day == 6)
        cout << "Saturday" << endl;
    else if (day == 7)
        cout << "Sunday" << endl;
    else
        cout << "Invalid input" << endl;

}






// Using Switch:

#include <iostream>
using namespace std;

int main() {
    int day;
    cout << "Enter a number (1-7): ";
    cin >> day;

    switch (day) {
    case 1:
        cout << "Monday" << endl;
        break;
    case 2:
        cout << "Tuesday" << endl;
        break;
    case 3:
        cout << "Wednesday" << endl;
        break;
    case 4:
        cout << "Thursday" << endl;
        break;
    case 5:
        cout << "Friday" << endl;
        break;
    case 6:
        cout << "Saturday" << endl;
        break;
    case 7:
        cout << "Sunday" << endl;
        break;
    default:
        cout << "Invalid input" << endl;
    }

}









// 17. WAP to check whether a year is a leap year or not.

#include <iostream>
using namespace std;

int main() {
    int year;
    cout << "Enter a year: ";
    cin >> year;

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        cout << year << " is a leap year." << endl;
    else
        cout << year << " is not a leap year." << endl;

}







// 18. WAP to take input 3 numbers from the user and print them in descending order.


#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    if (a > b && a > c) {
        if (b > c)
            cout << a << ", " << b << ", " << c << endl;
        else
            cout << a << ", " << c << ", " << b << endl;
    } else if (b > a && b > c) {
        if (a > c)
            cout << b << ", " << a << ", " << c << endl;
        else
            cout << b << ", " << c << ", " << a << endl;
    } else {
        if (a > b)
            cout << c << ", " << a << ", " << b << endl;
        else
            cout << c << ", " << b << ", " << a << endl;
    }

}








// 19. WAP to calculate tax based on income.

#include <iostream>
using namespace std;

int main() {
    double income, tax = 0;
    cout << "Enter your income: ";
    cin >> income;

    if (income <= 10000) {
        tax = 0;
    } else if (income <= 25000) {
        tax = 0.1 * (income - 10000);
    } else if (income <= 50000) {
        tax = 2500 + 0.2 * (income - 25000);
    } else {
        tax = 5000 + 0.3 * (income - 50000);
    }

    cout << "Tax to be paid: " << tax << endl;

}






// 20. WAP to perform arithmetic operations as per user's choice.

#include <iostream>
using namespace std;

int main() {
    int a, b, choice;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    cout << "Choose an operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n";
    cin >> choice;

    switch (choice) {
    case 1:
        cout<< "Sum: "<< (a + b)<< endl;
        break;
    case 2:
        cout<< "Difference: "<< (a - b)<< endl;
        break;
    case 3:
        cout<< "Product: "<< (a * b)<< endl;
        break;
    case 4:
        if(b != 0)
            cout<< "Quotient: "<< (a / b)<< endl;
        else
            cout<< "Division by zero is not allowed."<< endl;
        break;

    default:
        cout << "Invalid choice."<< endl;
    }

}




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


// 21. WAP to calculate area of rectangle, circle, and triangle as per user's choice.


#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int choice;
    cout << "Choose shape:\n1. Rectangle\n2. Circle\n3. Triangle\n";
    cin >> choice;

    switch (choice) {
    case 1: {
        double length, breadth;
        cout << "Enter length and breadth: ";
        cin >> length >> breadth;
        cout << "Area of Rectangle: " << (length * breadth) << endl;
        break;
    }
    case 2: {
        double radius;
        cout << "Enter radius: ";
        cin >> radius;
        cout << "Area of Circle: " << (3.14159 * radius * radius) << endl;
        break;
    }
    case 3: {
        double base, height;
        cout << "Enter base and height: ";
        cin >> base >> height;
        cout << "Area of Triangle: " << (0.5 * base * height) << endl;
        break;
    }
    default:
        cout << "Invalid choice." << endl;
    }

}






// 22. WAP to check whether a character is an alphabet, digit, or special symbol.


#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;

    if (isalpha(ch))
        cout << ch << " is an alphabet." << endl;
    else if (isdigit(ch))
        cout << ch << " is a digit." << endl;
    else
        cout << ch << " is a special symbol." << endl;


}






// 23. WAP to check whether a character is uppercase or lowercase.


#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;

    if (isupper(ch))
        cout << ch << " is uppercase." << endl;
    else if (islower(ch))
        cout << ch << " is lowercase." << endl;
    else
        cout << ch << " is not a letter." << endl;


}






// 24. WAP to check whether a character is a vowel or consonant.

#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;

    ch = tolower(ch); // Convert to lowercase for uniformity
    if (isalpha(ch)) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            cout << ch << " is a vowel." << endl;
        else
            cout << ch << " is a consonant." << endl;
    } else {
        cout << ch << " is not a valid alphabet." << endl;
    }

}






// 25. WAP to convert a character into its toggle case.

#include <iostream>
using namespace std;

int main() {
    char ch;
    cout << "Enter a character: ";
    cin >> ch;

    if (isalpha(ch)) {
        if (islower(ch))
            ch = toupper(ch);
        else
            ch = tolower(ch);

        cout << "Toggled case: " << ch << endl;
    } else {
        cout << "Input is not an alphabet." << endl;
    }


}






// 26. WAP to print numbers between a given range.

#include <iostream>
using namespace std;

int main() {
    int lower, upper;
    cout << "Enter lower and upper limits: ";
    cin >> lower >> upper;

    cout << "Numbers between " << lower << " and " << upper << ": ";
    for (int i = lower + 1; i < upper; i++) {
        cout << i << " ";
    }
    cout << endl;

}







// 27. WAP to print all even numbers between a given range.

#include <iostream>
using namespace std;

int main() {
    int lower, upper;
    cout << "Enter lower and upper limits: ";
    cin >> lower >> upper;

    cout << "Even numbers between " << lower << " and " << upper << ": ";
    for (int i = lower + 1; i < upper; i++) {
        if (i % 2 == 0)
            cout << i << " ";
    }
    cout << endl;

}






// 28. WAP to calculate the factorial of a number.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    unsigned long long factorial = 1;
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }

    cout << "Factorial of " << num << " is " << factorial << endl;

}







// 29. WAP to print the table of a number.

#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    cout << "Table of " << num << ":\n";
    for (int i = 1; i <= 10; i++) {
        cout << num << " x " << i << " = " << num * i << endl;
    }


}





// 30. WAP to calculate the sum of divisors of a number.

#include <iostream>
using namespace std;

int main(){
    int num, sum=0;
    cout<<"Enter a number: ";
    cin>>num;

    for (int i = 1; i <= num / 2; i++){
        if(num % i == 0)
            sum += i;
    }
    cout<<"Sum of divisors of "<<num<<" is "<<sum<<endl;
}

// 31. WAP to check whether a number is perfect.

#include <iostream>
using namespace std;

int main() {
    int num, sum = 0;
    cout << "Enter a number: ";
    cin >> num;

    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0)
            sum += i;
    }

    if (sum == num)
        cout << num << " is a perfect number." << endl;
    else
        cout << num << " is not a perfect number." << endl;

}




// 32. WAP to print the reverse of a number.

#include <iostream>
using namespace std;

int main() {
    int num, reversed = 0;
    cout << "Enter a number: ";
    cin >> num;

    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    cout << "Reversed number: " << reversed << endl;
    
}





// 33. WAP to check whether a number is a palindrome.

#include <iostream>
using namespace std;

int main() {
    int num, original, reversed = 0;
    cout << "Enter a number: ";
    cin >> num;

    original = num;
    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    if (original == reversed)
        cout << original << " is a palindrome." << endl;
    else
        cout << original << " is not a palindrome." << endl;
}






// 35. WAP to print different series.


// (a) Series: 1, 3, 6, 10, 15, ... nth term

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;

    int term = 0;
    for (int i = 1; i <= n; i++) {
        term += i;
        cout << term << " ";
    }
    cout << endl;

    return 0;
}




// (b) Series: 1, 11, 111, 1111, ... nth term


#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;

    int term = 1;
    for (int i = 1; i <= n; i++) {
        cout << term << " ";
        term = term * 10 + 1;
    }
    cout << endl;

    return 0;
}


// (c) Series: 1, 12, 123, 1234, ... nth term


#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            cout << j;
        }
        cout << " ";
    }
    cout << endl;

    return 0;
}



// 36. WAP to calculate average of even and odd numbers until user presses -1.


#include <iostream>
using namespace std;

int main() {
    int num, evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;

    cout << "Enter numbers (-1 to stop): ";
    while (true) {
        cin >> num;
        if (num == -1) break;

        if (num % 2 == 0) {
            evenSum += num;
            evenCount++;
        } else {
            oddSum += num;
            oddCount++;
        }
    }

    if (evenCount > 0)
        cout << "Average of even numbers: " << (double)evenSum / evenCount << endl;
    else
        cout << "No even numbers entered." << endl;

    if (oddCount > 0)
        cout << "Average of odd numbers: " << (double)oddSum / oddCount << endl;
    else
        cout << "No odd numbers entered." << endl;

    return 0;
}






// 37. Define a class MovieMagic to display the title and a message based on its rating.


#include <iostream>
#include <string>
using namespace std;

class MovieMagic {
    int year;
    string title;
    float rating;

public:
    MovieMagic() : year(0), title(""), rating(0.0) {}

    void accept() {
        cout << "Enter year of release: ";
        cin >> year;
        cin.ignore();
        cout << "Enter title of the movie: ";
        getline(cin, title);
        cout << "Enter movie rating (0.0 to 5.0): ";
        cin >> rating;
    }

    void display() {
        cout << "Title: " << title << endl;
        if (rating >= 0.0 && rating <= 2.0)
            cout << "Message: Flop" << endl;
        else if (rating > 2.0 && rating <= 3.4)
            cout << "Message: Semi-hit" << endl;
        else if (rating > 3.4 && rating <= 4.5)
            cout << "Message: Hit" << endl;
        else if (rating > 4.5 && rating <= 5.0)
            cout << "Message: Super Hit" << endl;
        else
            cout << "Invalid rating!" << endl;
    }
};

int main() {
    MovieMagic movie;
    movie.accept();
    movie.display();
    return 0;
}






// 38. Define a class ParkingLot to calculate parking charges.


#include <iostream>
using namespace std;

class ParkingLot {
    int vehicleNumber;
    double hours, bill;

public:
    ParkingLot() : vehicleNumber(0), hours(0.0), bill(0.0) {}

    void input() {
        cout << "Enter vehicle number: ";
        cin >> vehicleNumber;
        cout << "Enter parking hours: ";
        cin >> hours;
    }

    void calculate() {
        if (hours <= 1)
            bill = 3.0;
        else
            bill = 3.0 + (hours - 1) * 1.5;
    }

    void display() {
        cout << "Vehicle Number: " << vehicleNumber << endl;
        cout << "Parking Hours: " << hours << endl;
        cout << "Total Bill: Rs " << bill << endl;
    }
};

int main() {
    ParkingLot lot;
    lot.input();
    lot.calculate();
    lot.display();
    return 0;
}





// 39. WAP to count alphabets, digits, and special symbols in a string.

#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    int alphabets = 0, digits = 0, specials = 0;

    for (char ch : str) {
        if (isalpha(ch))
            alphabets++;
        else if (isdigit(ch))
            digits++;
        else
            specials++;
    }

    cout << "Alphabets: " << alphabets << endl;
    cout << "Digits: " << digits << endl;
    cout << "Special symbols: " << specials << endl;

    return 0;
}




// 40. WAP to convert a string into PIGLATIN form.

#include <iostream>
#include <string>
#include <cctype>
using namespace std;

string toPigLatin(string word) {
    char firstChar = tolower(word[0]);
    string pigLatin;

    if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i'
    || firstChar == 'o' || firstChar == 'u')
        pigLatin = word + "yay";
    else
        pigLatin = word.substr(1) + firstChar + "ay";

    return pigLatin;
}

int main() {
    string str, word, result = "";
    cout << "Enter a sentence: ";
    getline(cin, str);

    for (size_t i = 0; i <= str.length(); i++) {
        if (i == str.length() || isspace(str[i])) {
            if (!word.empty()) {
                result += toPigLatin(word) + " ";
                word = "";
            }
        } else {
            word += str[i];
        }
    }

    cout << "PigLatin form: " << result << endl;

}


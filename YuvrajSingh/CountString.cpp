#include <iostream>
#include <string> 
using namespace std;

int main() {
    string input;
    int alphabets = 0, digits = 0, specialSymbols = 0;

    cout << "Enter a string: ";
    getline(cin, input);

    for (char ch : input) {
        if (isalphabhet(ch)) {
            alphabets++;
        } else if (isdigit(ch)) {
            digits++;
        } else {
            specialSymbols++;
        }
    }

    cout << "Alphabets: " << alphabets << endl;
    cout << "Digits: " << digits << endl;
    cout << "Special Symbols: " << specialSymbols << endl;

    return 0;
}

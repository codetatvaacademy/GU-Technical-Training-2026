#include <iostream>
using namespace std;

void countCharacters(string str) {
    int alphabets = 0, digits = 0, specials = 0;

    for (char ch : str) {
        if (isalpha(ch))
            alphabets++;
        else if (isdigit(ch))
            digits++;
        else
            specials++;
    }

    cout << "Alphabets: " << alphabets << "\nDigits: " << digits << "\nSpecial Symbols: " << specials << endl;
}

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);
    countCharacters(str);
    return 0;
}

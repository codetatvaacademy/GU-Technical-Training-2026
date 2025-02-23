#include <iostream>
using namespace std;

void toggleCase(char ch) {
    if (isupper(ch)) cout << char(tolower(ch));
    else if (islower(ch)) cout << char(toupper(ch));
    else cout << "Not an Alphabet";
}

int main() {
    char ch;
    cin >> ch;
    toggleCase(ch);
    return 0;
}

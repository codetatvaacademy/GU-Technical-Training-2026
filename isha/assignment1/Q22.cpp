#include <iostream>
using namespace std;

void checkCharacter(char ch) {
    if (isalpha(ch)) cout << "Alphabet";
    else if (isdigit(ch)) cout << "Digit";
    else cout << "Special Symbol";
}

int main() {
    char ch;
    cin >> ch;
    checkCharacter(ch);
    return 0;
}

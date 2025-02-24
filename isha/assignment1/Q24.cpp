#include <iostream>
using namespace std;

void checkCase(char ch) {
    if (isupper(ch)) cout << "Uppercase";
    else if (islower(ch)) cout << "Lowercase";
    else cout << "Not an Alphabet";
}

int main() {
    char ch;
    cin >> ch;
    checkCase(ch);
    return 0;
}

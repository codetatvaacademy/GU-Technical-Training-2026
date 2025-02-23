#include <iostream>
using namespace std;

void checkVowelConsonant(char ch) {
    ch = tolower(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        cout << "Vowel";
    else
        cout << "Consonant";
}

int main() {
    char ch;
    cin >> ch;
    checkVowelConsonant(ch);
    return 0;
}

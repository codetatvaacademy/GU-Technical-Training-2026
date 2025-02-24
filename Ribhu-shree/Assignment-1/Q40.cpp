#include <iostream>
#include <cctype>
using namespace std;

bool isVowel(char c) {
    c = tolower(c);
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        return true;
    }
}

string toPiglatin(string word) {
    if (isVowel(word[0])) {
        return word + "way";
    }
    int i = 0;
    while (i < word.length() && !isVowel(word[i])) {
        i++;
    }

    if (i == word.length()) {
        return word + "ay"; 
    }
    return word.substr(i) + word.substr(0, i) + "ay";
}

int main() {
    string word;
    cout << "Enter a word: ";
    cin >> word;

    cout << "PigLatin Form: " << toPiglatin(word) << endl;
    return 0;
}

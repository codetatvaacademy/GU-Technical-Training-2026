#include <iostream>
#include <sstream>
using namespace std;

string toPigLatin(string word) {
    string vowels = "AEIOUaeiou";
    if (vowels.find(word[0]) != string::npos)
        return word + "way";
    else
        return word.substr(1) + word[0] + "ay";
}

void convertToPigLatin(string str) {
    stringstream ss(str);
    string word, result = "";

    while (ss >> word)
        result += toPigLatin(word) + " ";

    cout << "Pig Latin: " << result << endl;
}

int main() {
    string str;
    cout << "Enter a sentence: ";
    getline(cin, str);
    convertToPigLatin(str);
    return 0;
}

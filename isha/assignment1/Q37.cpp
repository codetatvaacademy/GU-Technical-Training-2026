#include <iostream>
using namespace std;

class MovieMagic {
private:
    int year;
    string title;
    float rating;

public:
    MovieMagic() : year(0), title(""), rating(0.0) {}

    void accept() {
        cout << "Enter movie title: ";
        cin.ignore();
        getline(cin, title);
        cout << "Enter release year: ";
        cin >> year;
        cout << "Enter movie rating (0.0 - 5.0): ";
        cin >> rating;
    }

    void display() {
        cout << "\nMovie: " << title << "\nYear: " << year << "\nRating: " << rating << "\nVerdict: ";
        if (rating >= 0.0 && rating <= 2.0)
            cout << "Flop\n";
        else if (rating <= 3.4)
            cout << "Semi-hit\n";
        else if (rating <= 4.5)
            cout << "Hit\n";
        else
            cout << "Super Hit\n";
    }
};

int main() {
    MovieMagic movie;
    movie.accept();
    movie.display();
    return 0;
}

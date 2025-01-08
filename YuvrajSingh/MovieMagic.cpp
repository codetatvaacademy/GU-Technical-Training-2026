#include <iostream>
#include <string>
using namespace std;

class MovieMagic {
private:
    int year;         
    string title;    
    double rating;   

public:
    MovieMagic() : year(0), title(""), rating(0.0) {}

    void accept() {
        cout << "Enter the movie title: ";
        getline(cin, title);
        cout << "Enter the release year: ";
        cin >> year;
        cout << "Enter the movie rating (0.0 to 5.0): ";
        cin >> rating;
    }

    void display() const {
        cout << "\nMovie Title: " << title << endl;

        if (rating >= 0.0 && rating <= 2.0) {
            cout << "Rating: Flop" << endl;
        } else if (rating > 2.0 && rating <= 3.4) {
            cout << "Rating: Semi-hit" << endl;
        } else if (rating > 3.4 && rating <= 4.5) {
            cout << "Rating: Hit" << endl;
        } else if (rating > 4.5 && rating <= 5.0) {
            cout << "Rating: Super Hit" << endl;
        } else {
            cout << "Invalid rating!" << endl;
        }
    }
};

int main() {
    MovieMagic movie;

    movie.accept();
    movie.display();

    return 0;
}

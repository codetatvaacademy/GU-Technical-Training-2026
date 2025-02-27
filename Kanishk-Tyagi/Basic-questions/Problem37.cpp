// Define a class called MovieMagic with the following description : -

//                                                                   1. Instance variables : -1. int year -
//                                                                                           to store the year of release of movie.2. String title - to store the title of the movie.3. float rating - to store the popularity rating of the movie.2. Member methods : -1. MovieMagic() - default constructor to initialise data members.2. void accept() - to input and store year,
//     title and rating.3. void display() - to display the title of a movie and a message based on the rating as per the table.1. 0.0 to 2.0 - Flop 2. 2.1 to 3.4 - Semi - hit 3. 3.5 to 4.5 - Hit 4. 4.6 to 5.0 - Super Hit 3. Write a main() method to create an object of the class and call the above member methods.
#include <bits/stdc++.h>
using namespace std;
class MovieMagic{
    private:
    int year;
    string title;
    float rating;
public:
    MovieMagic() : year(0), title(""), rating(0.0) {}
    void accept(){
        cin >> year;
        cin.ignore();
        getline(cin, title);
        cin >> rating;
    }
    void display(){
        cout << "Movie: "<< title<<endl;
        if (rating >= 0.0 && rating<= 2.0)
            cout << "Flop"<< endl;
        else if (rating <= 3.4)
            cout << "Semi-hit"<<endl;
        else if (rating <= 4.5)
            cout << "Hit" << endl;
        else if (rating <= 5.0)
            cout << "Super Hit"<<endl;
    }
};
int main(){
    MovieMagic obj;
    obj.accept();
    obj.display();
    return 0;
}

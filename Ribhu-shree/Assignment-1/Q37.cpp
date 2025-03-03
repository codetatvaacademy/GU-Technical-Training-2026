#include<iostream>
using namespace std;

class MovieMagic {
    int year;
    string title;
    float rating;

public:

    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0;
    }


    void accept() {
        cout<<"Enter the movie title: ";
        getline(cin,title);
        cout<<"Enter the year of release: ";
        cin>>year;
        cout<<"Enter the rating : ";
        cin>>rating;
    }

    void display() {
        cout<<"\nMovie Title: "<<title<<endl;
        cout<<"Year of Release: "<<year<<endl;
        cout<<"Rating: "<<rating<<endl;

        cout<<"Status: ";
        if(rating>=0.0 && rating<=2.0) cout<<"Flop"<<endl;
        else if(rating<=3.4) cout<<"Semi hit"<<endl;
        else if(rating<=4.5) cout<<"Hit"<<endl;
        else if(rating<=5.0) cout<<"Super Hit"<<endl;
        else cout<<"Invalid Rating!"<<endl;
    }
};

int main() {
    MovieMagic movie;
    movie.accept();
    movie.display();
    return 0;
}

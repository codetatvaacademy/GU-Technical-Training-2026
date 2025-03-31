// Define a class called MovieMagic with the following description :-

// 1. Instance variables :-
//    1. int year - to store the year of release of movie.
//    2. String title - to store the title of the movie.
//    3. float rating - to store the popularity rating of the movie.
// 2. Member methods :-
//    1. MovieMagic() - default constructor to initialise data members.
//    2. void accept() - to input and store year, title and rating.
//    3. void display() - to display the title of a movie and a message based on the rating as per the table.
//       1. 0.0 to 2.0 - Flop
//       2. 2.1 to 3.4 - Semi-hit
//       3. 3.5 to 4.5 - Hit
//       4. 4.6 to 5.0 - Super Hit
// 3. Write a main() method to create an object of the class and call the above member methods.

import java.util.Scanner;

class MovieMagic {
    private int year;
    private String title;
    private float rating;

    public MovieMagic() {
        this.year = 0;
        this.title = "";
        this.rating = 0.0f;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the movie title: ");
        title = scanner.nextLine();
        System.out.print("Enter the year of release: ");
        year = scanner.nextInt();
        System.out.print("Enter the rating (0.0 to 5.0): ");
        rating = scanner.nextFloat();
        scanner.close();
    }

    public void display() {
        System.out.println("Movie Title: " + title);
        System.out.println("Year of Release: " + year);
        
        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("Status: Flop");
        } else if (rating > 2.0 && rating <= 3.4) {
            System.out.println("Status: Semi-hit");
        } else if (rating > 3.4 && rating <= 4.5) {
            System.out.println("Status: Hit");
        } else if (rating > 4.5 && rating <= 5.0) {
            System.out.println("Status: Super Hit");
        } else {
            System.out.println("Invalid rating entered.");
        }
    }

    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept();
        movie.display();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
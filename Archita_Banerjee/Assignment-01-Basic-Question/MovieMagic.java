import java.util.Scanner;
public class MovieMagic {
    int year;
    String title;
    float rating;
    public MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title of the movie: ");
        title = sc.nextLine();

        System.out.print("Enter the year of release: ");
        year = sc.nextInt();

        System.out.print("Enter the rating of the movie (0.0 to 5.0): ");
        rating = sc.nextFloat();
    }

    public void display() {
        System.out.println("Movie Title: " + title);
        System.out.println("Year of Release: " + year);

        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("Rating: Flop");
        } else if (rating >= 2.1 && rating <= 3.4) {
            System.out.println("Rating: Semi-hit");
        } else if (rating >= 3.5 && rating <= 4.5) {
            System.out.println("Rating: Hit");
        } else if (rating >= 4.6 && rating <= 5.0) {
            System.out.println("Rating: Super Hit");
        } else {
            System.out.println("Invalid rating entered.");
        }
    }
    public static void main(String[] args) {

        MovieMagic m = new MovieMagic();
        m.accept();
        m.display();
    }
}

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of release: ");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the title of the movie: ");
        title = scanner.nextLine();
        System.out.print("Enter the rating of the movie: ");
        rating = scanner.nextFloat();
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Year of release: " + year);
        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("Flop");
        } else if (rating > 2.0 && rating <= 3.4) {
            System.out.println("Semi-hit");
        } else if (rating > 3.4 && rating <= 4.5) {
            System.out.println("Hit");
        } else if (rating > 4.5 && rating <= 5.0) {
            System.out.println("Super Hit");
        } else if (rating > 5.0 && rating <= 10.0) {
            System.out.println("Blockbuster");
        } else {
            System.out.println("Invalid rating");
        }
    }
    public static void main(String[] args) {
        MovieMagic m = new MovieMagic();
        m.accept();
        m.display();
    }
}
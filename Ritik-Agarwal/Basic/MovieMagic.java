import java.util.Scanner;

class MovieMagic {
    int year;
    String title;
    float rating;

    MovieMagic() {
        this.year = 0;
        this.title = "";
        this.rating = 0.0F;
    }

    MovieMagic(int year, String title, float rating) {
        this.year = year;
        this.title = title;
        this.rating = rating;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of movie: ");
        this.year = sc.nextInt();
        System.out.print("Enter title of movie: ");
        this.title = sc.next();
        System.out.print("Enter rating of movie: ");
        this.rating = sc.nextFloat();
        sc.close();
    }

    void display() {
        System.out.println("Title of movie is: " + this.title);
        if ((double) this.rating <= 2.0) {
            System.out.println("Flop movie");
        } else if ((double) this.rating >= 2.1 && (double) this.rating <= 3.4) {
            System.out.println("Semi-hit movie");
        } else if ((double) this.rating >= 3.5 && (double) this.rating <= 4.5) {
            System.out.println("Hit movie");
        } else if ((double) this.rating >= 4.6 && (double) this.rating <= 5.5) {
            System.out.println("Super Hit movie");
        }

    }
    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic(2018, "pk", 4.0F);
        movie.display();
        MovieMagic movie2 = new MovieMagic();
        movie2.accept();
        movie2.display();
    }
}

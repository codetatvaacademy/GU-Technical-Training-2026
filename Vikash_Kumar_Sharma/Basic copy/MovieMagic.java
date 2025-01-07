import java.util.Scanner;
public class MovieMagic {
	int year;
	String title;
	float rating = 0;

	MovieMagic() {
		year = 0;
		title = "";
		rating = (float) 0.0;
	}
	MovieMagic(int year, String title, float rating) {
		this.year = year;
		this.title = title;
		this.rating = rating;
	}
	void accept() {
		Scanner sn = new Scanner(System.in);
		this.year = sn.nextInt();
		this.title = sn.nextLine();
		this.rating = sn.nextInt();
	}

	void Display() {
		System.out.println("Movie title :+this.title");
		if (rating >= 0.0 && rating <= 2.0) {
			System.out.println("Your Movie Flop" + rating);
		} else if (rating >= 2.1 && rating <= 3.4) {
			System.out.println("Your Movie semi-hit" + rating);
		} else if (rating >= 3.5 && rating <= 4.5) {
			System.out.println("Your Movie Hit" + rating);
		} else { // Rating>=4.6 && Rating<=5.0
			System.out.println("Your Movie Super-Hit");
		}
	}

	public static void main(String[] args) {
		MovieMagic movieMagic = new MovieMagic();
		movieMagic.accept();
		movieMagic.Display();

	}
}

import java.util.Scanner;

public class P37_MovieMagic {
    int year ;
    String title ;
    float rating ;
    P37_MovieMagic() {
        year = 0 ;
        title = "" ;
        rating = 0.0f ;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter titile : ");
        title = sc.nextLine();

        System.out.print("Enter rating : ");
        rating = sc.nextFloat();
    }
    void display() {
        if ( rating < 2.0 ) {
            System.out.println("Flop");
        }
        else if (rating < 3.4) {
            System.out.println("Semi-hit");
        }
        else if(rating < 4.5) {
            System.out.println("hit");
        }
        else {
            System.out.println("Super Hit");
        }
    }

    public static void main(String[] args) {
        P37_MovieMagic p = new P37_MovieMagic();
        p.accept();
        p.display();
    }
}

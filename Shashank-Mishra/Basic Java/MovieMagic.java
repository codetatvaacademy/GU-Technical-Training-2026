import java.util.Scanner;

public class MovieMagic {
    int year;
    String title;
    float rating;

    public MovieMagic(){}

    public void accept(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter year: ");
        year = sc.nextInt();


        System.out.print("Enter rating: ");
        rating = sc.nextFloat();     
        
        sc.close();
    }   

    public void display(){
        if(rating>=0.0 && rating <= 2.0){
            System.out.print(title+" - Flop");
        }
        else if(rating>=2.1 && rating<=3.4){
            System.out.print(title+" - Semi-hit ");
        }
        else if(rating>=3.5 && rating<=4.5){
            System.out.print(title+" - Hit");
        }
        else if(rating>=4.6 && rating <=5.0){
            System.out.print(title+" - Super-hit");
        }
    } 
    
    public static void main(String[] args) {
        MovieMagic movie1 = new MovieMagic();

        movie1.accept();
        movie1.display();

    }

    
}
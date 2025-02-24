import java.util.*;
public class MovieMagic{
    int year;
    String title;
    float rating;
    MovieMagic(){
        year=0;
        title="";
        rating=(float)0.0;
    }
    void accept(int year, String title, float rating){
        this.year=year;
        this.title=title;
        this.rating=rating;
    }
    void display(){
        System.out.println("Movie: "+title);
        if(rating>=0.0 && rating<=2.0){
            System.out.println("rating: Flop");
        }
        else if(rating>=2.1 && rating<=3.4){
            System.out.println("rating: Semi-hit");
        }
        else if(rating>=3.5 && rating<=4.5){
            System.out.println("rating: Hit");
        }
        else if(rating>=4.6 && rating<=5.0){
            System.out.println("rating: Super-Hit");
        }
    }
    public static void main(String args[]){
        MovieMagic movie=new MovieMagic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int y=sc.nextInt();
        System.out.println("Enter title:");
        String t=sc.next();
        System.out.println("Enter rating:");
        float r=sc.nextFloat();
        movie.accept(y,t,r);
        movie.display();
        sc.close();
    }
}
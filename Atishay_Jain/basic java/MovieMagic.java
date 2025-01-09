package Atishay_Jain;

import java.util.*;

public class MovieMagic {

    int year;
    String name;
    Float rating;
    public static void main(String[] args){
        MovieMagic movie=new MovieMagic();
        movie.accept();
        movie.display(); 
    }
    public void MovieMagic(){
        year=0;
        name="";
        rating=0.0f;
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the name of the movie: ");
        name=sc.nextLine();
        
        System.out.print("Enter the year of the movie: ");
        year=sc.nextInt();

        System.out.print("Enter the rating of the movie: ");
        rating=sc.nextFloat();
    }
    public void display(){
        if(rating<2.0){
            System.out.println("Flop");
        }
        else if(rating<3.4){
            System.out.println("Semi-hit");
        }
        else if(rating<4.5){
            System.out.println("Hit");
        }
        else{
            System.out.println("Super Hit");
        }
    }
}


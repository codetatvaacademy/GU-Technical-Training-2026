import java.util.Scanner;
import java.lang.Math;
public class Square_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        double square=Math.pow(number, 2);
        double cube = Math.pow(number,3);
        
        System.out.println("Square of your number :"+ square);
        System.out.println("Cube of your number: "+cube);
    }
    
}
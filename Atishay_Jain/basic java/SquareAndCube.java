package Atishay_Jain;

import java.util.*;

public class SquareAndCube {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        double square=n*n;
        System.out.println("Square of the number: " +square);
        
        double cube=n*n*n;
        System.out.println("Cube of the number: " +cube);
        
    }
}

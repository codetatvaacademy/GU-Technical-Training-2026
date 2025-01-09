package Atishay_Jain;

import java.util.*;

public class AreaOfTriCirSqu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float radius=sc.nextFloat();
        
        System.out.println("Enter length of Traingle: ");
        float length=sc.nextFloat();
        System.out.println("Enter breadth of Triangle: ");
        float breadth=sc.nextFloat();
        
        System.out.println("Enter side of Square: ");
        float side=sc.nextFloat();

        double areaOfCircle=3.14 * radius * radius;
        System.out.println("The Area of circle: "+ areaOfCircle);
        
        double areaOfTriangle=2*length*breadth;
        System.out.println("The Area of triangle: "+ areaOfTriangle);

        double areaOfSquare=side*side;
        System.out.println("The Area of sqaure: "+ areaOfSquare);
    }
}


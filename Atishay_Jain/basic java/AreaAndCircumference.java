package Atishay_Jain;

import java.util.*;

public class AreaAndCircumference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float radius=sc.nextFloat();

        double area=3.14 * radius * radius;
        System.out.println("The Area of the circle: "+ area);
        
        double circumference=2*3.14*radius;
        System.out.println("The circumference of the circle: "+ circumference);
    }
}

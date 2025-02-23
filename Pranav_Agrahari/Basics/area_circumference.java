//package Pranav_Agrahari.Basics;

import java.util.*;

 class area_circumference {
    public static double area (double r){
     double a = 3.14*r*r;
     return a;
    }
    public static double circumference (double r){
        double b = 3.14*2*r;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Radius");
        double r = sc.nextDouble();
        System.out.println("Area of circle is "+ area(r));
        System.out.println("Circumference of circle is " +circumference(r));
    }
}

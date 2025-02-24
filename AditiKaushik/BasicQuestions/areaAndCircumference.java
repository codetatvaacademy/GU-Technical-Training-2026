//WAP to calculate and print area of circle and circumference of circle.

import java.util.Scanner;

class areaAndCircumference{
    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static double circumferenceOfCircle(double radius){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextInt();
        System.out.println("Area of Circle: " + areaOfCircle(radius));
        System.out.println("Circumference of Circle: " + circumferenceOfCircle(radius));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
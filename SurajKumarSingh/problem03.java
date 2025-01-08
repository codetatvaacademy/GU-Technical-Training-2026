//3. WAP to calculate and print area of circle and circumference of circle.

import java.util.Scanner;
public class problem03 {
    public static double area(float radius){
        return (3.14 * radius * radius);
    }
    public static double circumference(float radius){
        return (2* 3.14 * radius );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius :");
        int r = sc.nextInt();
        System.out.println("area of circle : " + area(r));
        System.out.println("circumference of circle : " + circumference(r));
        sc.close();
    }
}

//WAP to calculate and print area of circle and circumference of circle.//
import java.util.Scanner;
public class AreaOfCircle{
    public static double area(double r){
        double a = Math.PI * r * r;
        return a;
    }
    public static double circumference(double r){
        double b = 2 * Math.PI * r;
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double r = sc.nextDouble();
        System.out.println("the area of the circle  is :" + area(r));
        System.out.println("the circumference of the circle is:" + circumference(r));
    }
}

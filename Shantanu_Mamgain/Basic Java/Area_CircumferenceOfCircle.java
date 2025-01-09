import java.util.*;
public class Area_CircumferenceOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double circleArea = 3.14*(Math.pow(radius,2));
        double circleCircumference = 2*3.14*radius;
        System.out.println("Area of circle : "+circleArea + "\nCircumference of circle : "+circleCircumference);
    }
}
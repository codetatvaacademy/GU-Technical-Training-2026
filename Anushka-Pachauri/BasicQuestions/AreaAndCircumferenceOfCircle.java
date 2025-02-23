import java.util.*;
class AreaAndCircumferenceOfCircle{
    static double area(double radius){
        return 3.14*radius*radius;
    }
    static double circumference(double radius){
        return 2*3.14*radius;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        System.out.println("Area of circle: "+area(radius));
        System.out.println("Circumference of circle: "+circumference(radius));
    }
}
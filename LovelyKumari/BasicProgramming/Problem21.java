import java.util.Scanner;

public class Problem21 {
    //WAP to calculate the area of rectangle, circle and triangle as per user's choice.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");

        System.out.print("Enter choice (1/2/3): ");
        int choice = sc.nextInt();
        double area=0;

        switch (choice) {
            case 1:
                //Rectangle area= Length* Width
                System.out.println("Enter the length of rectangle: ");
                double length= sc.nextDouble();
                System.out.println("Enter the length of rectangle: ");
                double width=sc.nextDouble();
                area= length*width;
                System.out.println("Area of the rectangle: "+ area);
                
                break;
            case 2:
                //Circle area=pi * radius * radius
                System.out.print("Enter radius of the circle: ");
                double radius=sc.nextDouble();
                area=Math.PI * radius * radius ;
                System.out.print("Area of the circle: " + area);
                break;
            case 3:
                //Triangle area=(1/2)(base * height)
                System.out.print("Enter base of the triangle: ");
                double base= sc.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height=sc.nextDouble();
                area= 0.5 * base * height;
                System.out.print("Area of the triangle: " + area);
                break;
            default:
                System.out.print("Invalid input! Please choose a valid option..");
                break;
        }

        
    }
}

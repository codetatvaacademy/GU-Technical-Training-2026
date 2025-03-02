// 21. WAP to calculate the area of rectangle, circle and triangle as per user's choice.
import java.util.Scanner;

public class AreaCalculator {
    public static void rectangleArea(Scanner scanner) {
        System.out.print("Enter length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public static void circleArea(Scanner scanner) {
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public static void triangleArea(Scanner scanner) {
        System.out.print("Enter base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Rectangle\n2. Circle\n3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                rectangleArea(scanner);
                break;
            case 2:
                circleArea(scanner);
                break;
            case 3:
                triangleArea(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}

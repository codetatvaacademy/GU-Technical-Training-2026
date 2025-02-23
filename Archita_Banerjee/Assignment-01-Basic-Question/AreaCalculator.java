import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                double areaRectangle = length * breadth;
                System.out.println("Area of the rectangle: " + areaRectangle);
                break;

            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + areaCircle);
                break;

            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of the triangle: " + areaTriangle);
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}

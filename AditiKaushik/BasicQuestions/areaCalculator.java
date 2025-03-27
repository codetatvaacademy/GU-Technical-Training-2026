// WAP to calculate the area of rectangle, circle and triangle as per user's choice.

import java.util.Scanner;

public class areaCalculator {
    public static double calculateArea(int choice, double... dimensions) {
        switch (choice) {
            case 1:
                return dimensions[0] * dimensions[1];
            case 2:
                return Math.PI * dimensions[0] * dimensions[0];
            case 3:
                return 0.5 * dimensions[0] * dimensions[1];
            default:
                System.out.println("Invalid choice! Please select a valid option.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double area;
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();
                area = calculateArea(choice, length, breadth);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                area = calculateArea(choice, radius);
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                area = calculateArea(choice, base, height);
                break;
            default:
                area = Double.NaN;
        }
        System.out.println(area);
        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
import java.util.Scanner;

public class P21_Area_CircleTriangleRectriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter 1 for Triangle ");
        System.out.println("Enter 2 for Circle ");
        System.out.println("Enter 3 for Retangle ");
        System.out.print("Enter your Choise :: ");
        int choise = sc.nextInt();

        if ( choise == 1 ) {
            System.out.print("Enter base of Triangle : ");
            int base = sc.nextInt();
            System.out.print("Enter height of Triangle : ");
            int height = sc.nextInt();

            System.out.println("Area of Triangle is :: " + (base * height)/2);
        }
        else if ( choise == 2 ) {
            System.out.print("Enter Radius of Circle : ");
            int r = sc.nextInt();
            System.out.println("Area of Circle is :: " + (3.14 * r * r ) );
        }
        else {
            System.out.print("Enter length of Rectangle : ");
            int length = sc.nextInt();
            System.out.print("Enter breadth of Rectangle : ");
            int breadth = sc.nextInt();
            System.out.println("Area of Retangle :: " + (length * breadth));
        }
    }
}

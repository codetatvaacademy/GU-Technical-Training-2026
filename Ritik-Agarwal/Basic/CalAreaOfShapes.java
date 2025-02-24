import java.util.Scanner;
public class CalAreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of shape: ");
        String shape = sc.next();
        if(shape == "rectangle"){
            System.out.println("Area of rectangle is: " + rectangle(sc));
        }
        else if(shape == "circle"){
            System.out.println("Area of circle is: " + circle(sc));
        }
        else if(shape == "triangle"){
            System.out.println("Area of triangle is: " + triangle(sc));
        }
        else{
            System.out.println("Invalid Shape");
        }
        sc.close();
    }
    private static int rectangle(Scanner sc){
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        return length*breadth;
    }
    private static float circle(Scanner sc){
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        return 3.14F*radius*radius;
    }
    private static float triangle(Scanner sc){
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        return 0.5F*base*height;
    }
}
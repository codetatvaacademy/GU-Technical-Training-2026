import java.util.*;
public class rectangle_circle_traingle {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice");
            System.out.println("1 for Rectangle ");
            System.out.println("2 for Circle");
            System.out.println("3 for Traingle");
            int choice = sc.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("Enter the Length of Rectangle ");
                    int l = sc.nextInt();
                    System.out.println("Enter the Breadth of Rectangle");
                    int b = sc.nextInt();
                    int area_rec = l*b;
                    System.out.println(area_rec);
                    break;
                    case 2:
                    System.out.println("Enter The radius of Circle");
                    double rad = sc.nextDouble();
                    double area_cir = 3.14*(rad*rad);
                    System.out.println(area_cir);
                    break;
                    case 3:
                    System.out.println("Enter the Height of Triangle");
                    double Height = sc.nextDouble();
                    System.out.println("Enter the Base of Triangle");
                    double base = sc.nextDouble();
                    double area_triangle = (1/2)*base*Height;
                    System.out.println(area_triangle);
                    break;
                default:
                    break;
            }
                }
    }


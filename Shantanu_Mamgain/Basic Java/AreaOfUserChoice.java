import java.util.Scanner;


public class AreaOfUserChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("  Enter 1: Area of rectangle\n\t2: Area of circle \n\t3: Area of triangle: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
    
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                System.out.println(length*breadth);
                break;
            
            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                System.out.println(2*3.14*radius*radius);
                break;
            
            case 3:
                System.out.print("Enter base length: ");
                double base = sc.nextDouble();
    
                System.out.print("Enter height: ");
                double height = sc.nextDouble();

                System.out.println((0.5*(base*height)));
                break;
            
            default:
                System.out.println("Invalid input");
                
        }
        sc.close();
    }
}

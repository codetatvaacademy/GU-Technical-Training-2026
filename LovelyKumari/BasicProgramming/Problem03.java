import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius=sc.nextDouble();

        //Area calc 
        double area =Math.PI * radius*radius ;
        System.out.println("Area of the circle = " + area);

        //Cicumference calc
        double circumference = 2 * Math.PI * radius ;
        System.out.println("Circumference of the circle = " + circumference);
    }
    
}

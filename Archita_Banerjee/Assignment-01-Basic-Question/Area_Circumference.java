import java.util.Scanner;
public class Area_Circumference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        double r= sc.nextInt();
        double area= Math.PI*r*r;
        double circum= 2*Math.PI*r;
        System.out.println("Area of circle "+ area);
        System.out.println("Circumference of the circle "+ circum);
    }
}

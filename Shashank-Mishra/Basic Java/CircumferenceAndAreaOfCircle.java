import java.util.*;
public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the radius of the circle ");
        int Number=sc.nextInt();
        double Area= Math.PI*Number*Number;
        double circumference =2*Math.PI*Number;
        System.out.println("The area of the circle is : "+ Area);
        System.out.println("The circumfernce of the circle is : "+circumference);
        
    }
}

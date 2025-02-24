//Question 3
import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of circle:");
        int r=sc.nextInt();
        //float pi=3.14;
        double area=3.14*(r*r);
        System.out.println("Area of circle="+area);
        double circumference=3.14*(2*r);
        System.out.println("Circumference of circle:" +circumference);
        sc.close();
    }
    
}

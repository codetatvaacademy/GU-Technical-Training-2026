// WAP to calculate and print area of circle and circumference of circle.
import java.util.*;

public class Solution {
    public static float area(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    public static float circumference(float radius) {
        return (float) (2 * Math.PI * radius);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();

        float area = area(radius);
        System.out.println("Area of Circle: " + area); 

        float circum = circumference(radius);
        System.out.println("Circumference of Circle: " + circum); 
    }
}

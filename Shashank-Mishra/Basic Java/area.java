import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the shape among (rectangle, triangle , circle ) for which you want to know the area");
        String shape =sc.nextLine();
        double area =0;

        switch(shape)
        {
            case "rectangle": System.out.println("Enter the length and breadth of the rectangle");
                             int length =sc.nextInt();
                             int breadth =sc.nextInt();
                             area = length *breadth;
                             System.out.println("The area of rectangle is " + area);
                             break;
            case "triangle": System.out.println("Enter the base and height of the traingle " );
                             int base =sc.nextInt();
                             int height=sc.nextInt();
                             area =  (base *height)/2;
                             System.out.println("The area of traingle is "+ area);
                              break;
            case "circle": System.out.println("Enter the radius of the circle ");
                           int radius = sc.nextInt();
                           area =22/7 *radius *radius;
                           System.out.println("The area of the circle is "+area);
                           break;
            default : System.out.println("Invalid");
        }

    }
    
}
